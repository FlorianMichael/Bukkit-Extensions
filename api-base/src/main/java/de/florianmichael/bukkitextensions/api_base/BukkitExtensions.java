package de.florianmichael.bukkitextensions.api_base;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BukkitExtensions {

    private final static BukkitExtensions self = new BukkitExtensions();
    private final Map<Class<? extends BukkitExtensionBase>, BukkitExtensionBase> extensionPipeline = new HashMap<>();
    private IErrorListener errorListener;

    public BukkitExtensionBase get(final Class<? extends BukkitExtensionBase> clazz) {
        if (!this.extensionPipeline.containsKey(clazz)) {
            final BukkitExtensionBase theBase;

            try {
                this.extensionPipeline.put(clazz, theBase = clazz.getConstructor().newInstance());
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }

            theBase.registerSubmit();
        }
        return this.extensionPipeline.get(clazz);
    }

    public void setErrorListener(final IErrorListener errorListener) {
        this.errorListener = errorListener;
    }

    public void throwError(final BukkitExtensionBase bukkitExtensionBase, final Throwable throwable) {
        if (this.errorListener == null) {
            throwable.printStackTrace();
            return;
        }

        this.errorListener.onError(bukkitExtensionBase, throwable);
    }

    public static BukkitExtensions self() {
        return self;
    }
}
