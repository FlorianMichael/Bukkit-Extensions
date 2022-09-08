package de.florianmichael.bukkitextensions.storage_objects_v1;

import de.florianmichael.bukkitextensions.api_base.BukkitExtensionBase;
import de.florianmichael.bukkitextensions.api_base.BukkitExtensions;

import java.util.HashMap;
import java.util.Map;

public class Storages extends BukkitExtensionBase {

    private final Map<Class<?>, StorageObject> storedObjects = new HashMap<>();
    private final Map<String, Object> directStorage = new HashMap<>();

    public void save(final String name, final Object object) {
        this.directStorage.put(name, object);
    }

    public Object get(final String name) {
        return this.directStorage.get(name);
    }

    @SuppressWarnings("unchecked")
    public <T extends StorageObject> T get(Class<T> objectClass) {
        return (T) this.storedObjects.get(objectClass);
    }

    public boolean has(Class<? extends StorageObject> objectClass) {
        return this.storedObjects.containsKey(objectClass);
    }

    @SuppressWarnings("unchecked")
    public <T extends StorageObject> T remove(Class<T> objectClass) {
        return (T) this.storedObjects.remove(objectClass);
    }

    public void put(StorageObject object) {
        this.storedObjects.put(object.getClass(), object);
    }

    public static Storages self() {
        return (Storages) BukkitExtensions.self().get(Storages.class);
    }

    public Storages() {
        super("Storages", 1, "Florian Michael");
    }
}
