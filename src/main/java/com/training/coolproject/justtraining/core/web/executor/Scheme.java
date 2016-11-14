package com.training.coolproject.justtraining.core.web.executor;

public enum Scheme {
    HTTP("http"), HTTPS("https");

    private final String name;

    Scheme(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
