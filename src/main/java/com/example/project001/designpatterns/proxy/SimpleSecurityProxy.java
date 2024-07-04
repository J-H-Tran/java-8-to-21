package com.example.project001.designpatterns.proxy;

public class SimpleSecurityProxy implements Runnable {
    private Runnable internal;
    private boolean permission;

    public SimpleSecurityProxy(Runnable internal) {
        this.internal = internal;
    }

    public void setPermission(boolean permission) {
        this.permission = permission;
    }

    @Override
    public void run() {
        if (permission) {
            internal.run();
        }
    }
}