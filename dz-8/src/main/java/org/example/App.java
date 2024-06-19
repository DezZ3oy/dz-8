package org.example;

import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Student> students = Student.createStudents();

        StudentsGroup group = new StudentsGroup(students.get(0));

        for (int i = 1; i < students.size(); i++) {
            group.addStudent(students.get(i));
        }

        List<Task> tasks = Task.createTasks();
        for (Task task : tasks) {
            group.addTask(task);
        }

        group.completeTask(students.get(1).getId(), students.get(1).getLastName(), "Вивчити інкапсуляцію");
        group.completeTask(students.get(0).getId(), students.get(0).getLastName(), "Виконати Дз №8");

        System.out.println("______Староста:______ ");
        System.out.println(group.getLeader());
        System.out.println("______Студенти:______");
        for (Student student : group.getStudents()) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("______Завдання:______");
        for (Task task : group.getTasks()) {
            System.out.println(task);
        }

        //Task newTask = new Task("тест");
        //group.addTask(newTask);



        System.out.println();
        group.changeLeader(students.get(2));
        System.out.println("●  Старосту було змінено на: " + group.getLeader());

        System.out.println();
        Student newStudent = new Student("8", "Михалков", "Іван", "Федорович", "41-РПЗ");
        group.addStudent(newStudent);

        System.out.println();
        group.removeStudent(students.get(5));

        System.out.println();
        System.out.println("______Оновлений список студентів:______");
        for (Student student : group.getStudents()) {
            System.out.println(student);
        }
    }
}
