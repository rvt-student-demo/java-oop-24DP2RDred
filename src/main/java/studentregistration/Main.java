package studentregistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        FileHandler storageService = new FileHandler("data/students.csv");
        RegistrationSystem registrationService = new RegistrationSystem(storageService);

        UserInterface ui = new UserInterface(console, registrationService);
        ui.start();
    }
}
