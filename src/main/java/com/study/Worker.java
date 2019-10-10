package com.study;

public class Worker {
    private String name="伐木工";
    private Axe axe;
    private Saw saw;
    private Tools tools;

    public void work() {
        System.out.println(name+"使用"+tools+"砍树");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Axe getAxe() {
        return axe;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public Saw getSaw() {
        return saw;
    }

    public void setSaw(Saw saw) {
        this.saw = saw;
    }

    public Tools getTools() {
        return tools;
    }

    public void setTools(Tools tools) {
        this.tools = tools;
    }
}
