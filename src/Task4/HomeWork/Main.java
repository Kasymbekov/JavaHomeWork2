package Task4.HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Init string variable and scanner
        String input;
        Scanner scanner = new Scanner(System.in);

        //Init 3 arraylists
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        //Add 5 elements to list A and print it
        System.out.println("Enter a text (5 rows):");
        for (int i = 0; i < 5; i++) {
            input = scanner.nextLine();
            listA.add(input);
        }
        System.out.println("List A - " + listA);

        //Add 5 elements to list B and print it
        System.out.println("Enter a text (5 rows):");
        for (int i = 0; i < 5; i++) {
            input = scanner.nextLine();
            listB.add(input);
        }
        System.out.println("List B - " + listB);

        //Add all elements from lists A and B into list C
        Collections.reverse(listB);
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        System.out.println("List C - " + listC);
    }
}
