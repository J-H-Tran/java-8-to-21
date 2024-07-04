package com.example.project001.singleton;

public class LazySingleton {
    private static LazySingleton INSTANCE;
    private static final Object LOCK = new Object();
    private LazySingleton() {}

    public LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LOCK) {
            if (INSTANCE == null) {
                INSTANCE = new LazySingleton();
            }
            }
        }
        return INSTANCE;
    }

}
