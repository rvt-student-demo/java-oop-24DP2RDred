package studentregistration;

import java.util.Scanner;

public class UserInterface {
    private Scanner inputScanner;
    private RegistrationSystem registrationService;

    public UserInterface(Scanner inputScanner, RegistrationSystem registrationService) {
        this.inputScanner = inputScanner;
        this.registrationService = registrationService;
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Izvēlies darbību:");
            System.out.println("register - reģistrēt jaunu studentu");
            System.out.println("show - rādīt visus studentus");
            System.out.println("remove - dzēst studentu pēc personas koda");
            System.out.println("edit - rediģēt studentu pēc personas koda");
            System.out.println("exit - apturēt programmu");
            System.out.print("Darbība: ");

            String command = inputScanner.nextLine();

            if (command.equals("exit")) {
                System.out.println("Programma apturēta.");
                break;
            } else if (command.equals("register")) {
                register();
            } else if (command.equals("show")) {
                registrationService.showStudents();
            } else if (command.equals("remove")) {
                remove();
            } else if (command.equals("edit")) {
                edit();
            } else {
                System.out.println("Nezināma komanda.");
            }
        }
    }

    private void register() {
        System.out.print("Vārds: ");
        String nameValue = inputScanner.nextLine();

        System.out.print("Uzvārds: ");
        String surnameValue = inputScanner.nextLine();

        System.out.print("E-pasts: ");
        String emailValue = inputScanner.nextLine();

        System.out.print("Personas kods: ");
        String personalCodeValue = inputScanner.nextLine();

        registrationService.registerStudent(nameValue, surnameValue, emailValue, personalCodeValue);
    }

    private void remove() {
        System.out.print("Ievadi personas kodu: ");
        String personalCodeValue = inputScanner.nextLine();

        registrationService.removeStudent(personalCodeValue);
    }

    private void edit() {
        System.out.print("Ievadi personas kodu: ");
        String personalCodeValue = inputScanner.nextLine();

        System.out.print("Jaunais vārds: ");
        String nameValue = inputScanner.nextLine();

        System.out.print("Jaunais uzvārds: ");
        String surnameValue = inputScanner.nextLine();

        System.out.print("Jaunais e-pasts: ");
        String emailValue = inputScanner.nextLine();

        registrationService.editStudent(personalCodeValue, nameValue, surnameValue, emailValue);
    }
}
