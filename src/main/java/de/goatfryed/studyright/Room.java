package de.goatfryed.studyright;

import java.util.ArrayList;

public class Room {
    private ArrayList<Student> students;
    private int credits;
    private String name;

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        if (students == null) {
            students = new ArrayList<>();
        }
        return students;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.name;
    }

    /**
     * inverse side
     * 
     * @param student
     */
    public void addStudent(Student student) {
        student.setIn(this);
    }
}
