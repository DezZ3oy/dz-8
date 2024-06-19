package org.example;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private final String description;
    private boolean completed;
    private String completedById;
    private String completedByLastName;

    public Task(String description) {
        this.description = description;
        this.completed = false;
        this.completedById = null;
        this.completedByLastName = null;
    }

    public String getDescription() {
        return description;
    }

    public void complete(String studentId, String studentLastName) {
        this.completed = true;
        this.completedById = studentId;
        this.completedByLastName = studentLastName;
    }



    public static List<Task> createTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Вивчити інкапсуляцію"));
        tasks.add(new Task("Виконати Дз №8"));
        return tasks;
    }
    @Override
    public String toString() {
        String result = description + " Виконав: " + completed;
        if (completed) {
            result += ", студент: " + completedByLastName + " (ID: " + completedById + ")";
        }
        return result;
    }

}
