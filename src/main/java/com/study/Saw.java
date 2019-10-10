package com.study;

public class Saw implements Tools {
    private String name;

    public Saw() {
        this.name="电锯";
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
