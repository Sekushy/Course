package com.company;

import java.util.List;

public class Materie {
    private int id;
    private String name;
    private Profesor professor;
    private List<Student> students;
    private boolean isStudentAttendingClass;
    private boolean isClassBeingTaught;

    // TODO Create getters and setters for the class

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

    public void setProfessor(Profesor professor) {
        this.professor = professor;
    }

    public Profesor getProfessor() {
        return this.professor;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void setStudentAttendingClass(boolean studentAttendingClass) {
        isStudentAttendingClass = studentAttendingClass;
    }

    public boolean isStudentAttendingClass() {
        return isStudentAttendingClass;
    }

    public void setClassBeingTaught(boolean classBeingTaught) {
        isClassBeingTaught = classBeingTaught;
    }

    public boolean isClassBeingTaught() {
        return isClassBeingTaught;
    }
}

