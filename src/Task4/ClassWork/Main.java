package Task4.ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        Collections.sort(colors);
        System.out.println(colors);

        Collections.reverse(colors);
        System.out.println(colors);

        Collections.shuffle(colors);
        System.out.println(colors);

        int count = 0;
        for (String s : colors) {
            count++;
            System.out.println(count + ". " + s);
        }

        count = 0;
        System.out.println("-------------------");

        for (int i = 0; i < colors.size(); i++) {
            count++;
            System.out.println(count + ". " + colors.get(i));
        }

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Azamat", 12));
        players.add(new Player("Aibek", 23));
        players.add(new Player("Nurbek", 10));
        int c = 0;
        for (Player p : players) {
            c++;
            System.out.println(c + ". " + p);
        }
    }
}
