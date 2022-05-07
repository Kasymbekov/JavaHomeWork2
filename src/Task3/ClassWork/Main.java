package Task3.ClassWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        while (true) {
            System.out.println("Enter a name:");
            try {
                user.setName(scanner.next());
                System.out.println("Name added successfully. Your name is " + user.getName());
                System.out.println("Enter an age:");
                user.setAge(scanner.nextInt());
                System.out.println("Age added successfully. Your age is " + user.getAge());
            } catch (IllegalNameLengthException ie) {
                System.out.println("Error! " + ie.getMessage());
            } catch (IllegalAgeException e) {
                System.out.println("Error! " + e.getMessage());
            }
        }

    }
}
