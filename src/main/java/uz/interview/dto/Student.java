package uz.interview.dto;

import java.util.Objects;

public class Student {

    private String name;
    private String univer;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String univer, Integer age) {
        this.name = name;
        this.univer = univer;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniver() {
        return univer;
    }

    public void setUniver(String univer) {
        this.univer = univer;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Student student = (Student) o;
//
//        if (name != null ? !name.equals(student.name) : student.name != null) return false;
//        return univer != null ? univer.equals(student.univer) : student.univer == null;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", univer='" + univer + '\'' +
                '}';
    }
}
