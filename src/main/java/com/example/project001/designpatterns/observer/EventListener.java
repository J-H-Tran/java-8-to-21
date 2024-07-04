package com.example.project001.designpatterns.observer;

import java.util.Map;

public interface EventListener {
    void onEvent(Map<String, Object> eventMetadata);
}
