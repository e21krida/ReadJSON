package com.example.readjson;

import androidx.annotation.NonNull;

public class MountainClass {
    private String name;
    private String location;
    private Integer size;

    public MountainClass(String name, String location, Integer size) {
        this.name = name;
        this.location = location;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @NonNull
    @Override
    public String toString() {
        return name = " has an altitude of "+ size +"s above sea level";
    }
}
