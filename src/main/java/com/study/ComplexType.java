package com.study;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ComplexType {
    private int[] arr;
    private String[] names;
    private List<String> cities;
    private Map<String, String> map;
    private List<Tools> tools;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<Tools> getTools() {
        return tools;
    }

    public void setTools(List<Tools> tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "ComplexType{" +
                "arr=" + Arrays.toString(arr) +
                ", names=" + Arrays.toString(names) +
                ", cities=" + cities +
                ", map=" + map +
                ", tools=" + tools +
                '}';
    }
}
