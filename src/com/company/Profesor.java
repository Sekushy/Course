package com.company;

import java.util.List;

public class Profesor extends Entity{
    public List<Student> students;

    // TODO Getters and setters


    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void evaluateStudent(Student studentEvaluated, boolean evaluateStudent) {
        studentEvaluated.setStudentEvaluated(evaluateStudent);
    }

    public void teachCourse(Materie classBeingTaught, boolean teachCourse) {
       classBeingTaught.setClassBeingTaught(teachCourse);
    }

}
