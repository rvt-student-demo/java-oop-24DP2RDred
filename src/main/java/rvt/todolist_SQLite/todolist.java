package rvt;

import java.util.List;

public class todolist {

    private TodoDatabase db;

    public todolist() {
        db = new TodoDatabase();
    }

    public void add(String task) {
        db.add(task);
    }

    public void print() {
        List<TodoDatabase.Task> tasks = db.getAll();
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i).task);
        }
    }

    public void remove(int number) {
        List<TodoDatabase.Task> tasks = db.getAll();
        if (number < 1 || number > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }
        int id = tasks.get(number - 1).id;
        db.removeById(id);
    }
}
