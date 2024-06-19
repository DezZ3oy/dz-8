package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private Student leader;
    private final List<Student> students;
    private final List<Task> tasks;

    public StudentsGroup(Student leader) {
        if (leader == null) {
            throw new IllegalArgumentException("Група не може існувати без старости.");
        }
        this.leader = leader;
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.students.add(leader);
    }

    public Student getLeader() {
        return leader;
    }

    public void changeLeader(Student newLeader) {
        if (!students.contains(newLeader)) {
            throw new IllegalArgumentException("Новий староста повинен бути членом групи.");
        }
        this.leader = newLeader;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("✅  Додано студента: " + student);
        }
    }

    public void removeStudent(Student student) {
        if (students.contains(student) && !student.equals(leader)) {
            students.remove(student);
            System.out.println("❌  Видалено студента: " + student);
        } else if (student.equals(leader)) {
            throw new IllegalArgumentException("Неможливо видалити старосту з групи.");
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Нове завдання: " + task);
    }

    public void completeTask(String studentId, String studentLastName, String taskDescription) {
        for (Task task : tasks ) {
            if (task.getDescription().equals(taskDescription)) {
                task.complete(studentId, studentLastName);
                break;
            }
        }
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

}
