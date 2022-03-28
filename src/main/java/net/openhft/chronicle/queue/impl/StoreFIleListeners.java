package net.openhft.chronicle.queue.impl;

import net.openhft.chronicle.core.Jvm;

import java.io.File;

public enum StoreFIleListeners implements StoreFileListener {
    NO_OP {
        @Override
        public void onReleased(int cycle, File file) {
        }
    },
    DEBUG {
        @Override
        public void onReleased(int cycle, File file) {
            if (Jvm.isDebugEnabled(getClass()))
                Jvm.debug().on(getClass(), "File released " + file);
        }
    }
}
