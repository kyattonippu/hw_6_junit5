package com.kyattonippu;

public enum SeriesNames {

    WITCHER("Witcher"),
    DEXTER("Dexter");

    private String name;

    SeriesNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
