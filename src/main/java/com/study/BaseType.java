package com.study;

public class BaseType {
    private int age;
    private double price;
    private long time;
    private float size;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BaseType{" +
                "age=" + age +
                ", price=" + price +
                ", time=" + time +
                ", size=" + size +
                '}';
    }
}
