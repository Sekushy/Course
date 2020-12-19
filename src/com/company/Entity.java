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
        return id;
    }
  
      public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(List<Materie> classes) {
        this.classes = classes;
    }

    public List<Materie> getClasses() {
        return classes;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
