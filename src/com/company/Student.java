package com.company;

import java.util.List;

public class Student extends Entity {
    public String group;
    public double average;

    // TODO Getters and setters for the class

    public void attendanceToClass(Materie classAttended, boolean isStudentAttending) {
        // TODO Verify Students and Material for the class
        classAttended.setStudentAttendingClass(isStudentAttending);
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

}