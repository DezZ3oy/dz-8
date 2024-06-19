package org.example;
import java.util.Arrays;
import java.util.List;

public class Student {
    private final String id;
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String group;

    public Student(String id, String lastName, String firstName, String middleName, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + " [ID: " + id + ", Група: " + group + "]";
    }

    public static List<Student> createStudents() {
        return Arrays.asList(
                new Student("1", "Тригуб", "Владислав", "Юрійович", "41-РПЗ"),
                new Student("2", "Радько", "Федір", "Віталійович", "41-РПЗ"),
                new Student("3", "Степаненко", "Олексій", "Васильович", "41-РПЗ"),
                new Student("4", "Коп'янець", "Ігнат", "Андрійович", "41-РПЗ"),
                new Student("5", "Фещенко", "Ірина", "Миколаївна", "41-РПЗ"),
                new Student("6", "Рум'янець", "Антон", "Олексійович", "41-РПЗ"),
                new Student("7", "Хоменко", "Ігор", "Павлович", "41-РПЗ")


        );
    }
}
