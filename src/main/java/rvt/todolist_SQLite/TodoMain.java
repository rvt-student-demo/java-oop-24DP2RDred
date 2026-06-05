package rvt;

import java.util.Scanner;

public class TodoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        todolist list = new todolist();
        userinterface ui = new userinterface(list, scanner);
        ui.start();
        scanner.close();
    }
}
