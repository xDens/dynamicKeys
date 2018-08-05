package com.example.ttest.model;

import java.util.List;

public class Data {
    private String test;
    private List<KeyValue> list;

    public Data() {

    }

    public Data(String test, List<KeyValue> list) {
        this.test = test;
        this.list = list;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public List<KeyValue> getList() {
        return list;
    }

    public void setList(List<KeyValue> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Data{" +
                "test='" + test + '\'' +
                ", list=" + list +
                '}';
    }
}
