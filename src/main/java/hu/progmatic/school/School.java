package hu.progmatic.school;

import java.util.Arrays;

public class School {
    private String name;
    private Student[] students;

    public School() {
    }

    public School(String name, Student... students) {
        System.out.println("LOG: " + students.length + " students set via constructor.");
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
