package com.company;

import java.util.List;

public class Entity {
    public int id;
    public String name;
    public List<Materie> classes;
    public int age;

    // TODO Getters and setters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setClasses(List<Materie> classes) {
        this.classes = classes;
    }

    public List<Materie> getClasses() {
        return this.classes;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
