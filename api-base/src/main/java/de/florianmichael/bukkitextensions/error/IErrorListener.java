package de.florianmichael.bukkitextensions.error;

import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;

public interface IErrorListener {

    void onError(final BukkitExtensionBase extensionBase, final Throwable throwable);

}
