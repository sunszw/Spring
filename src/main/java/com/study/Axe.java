package com.study;

public class Axe implements Tools {
    private String name;

    public Axe() {
        this.name="斧子";
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
