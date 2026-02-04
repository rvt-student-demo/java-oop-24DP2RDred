package rvt;

import java.util.Scanner;

public class userinterface {
    
    private todolist list;
    private Scanner scanner;
    
    public userinterface(todolist list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = scanner.nextLine();
            
            if (cmd.equals("stop")) {
                break;
            }
            
            if (cmd.equals("add")) {
                add();
            }
            
            if (cmd.equals("list")) {
                list();
            }
            
            if (cmd.equals("remove")) {
                remove();
            }
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String st = scanner.nextLine();
        list.add(st);
    }
    
    public void list() {
        list.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int toBeRemoved = Integer.parseInt(scanner.nextLine());
        list.remove(toBeRemoved);
    }
}
