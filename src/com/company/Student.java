package com.company;

import java.util.List;

public class Student extends Entity {
    public String group;
    public double average;
    public boolean isStudentEvaluated;

    // TODO Getters and setters for the class

    public void attendanceToClass(Materie classAttended) {
        // TODO
    }

    public void setStudentEvaluated(boolean studentEvaluated) {
        isStudentEvaluated = studentEvaluated;
    }
}
