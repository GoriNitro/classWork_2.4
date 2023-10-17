import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        System.out.println(colors);
        colors.ensureCapacity(6);
        System.out.println(colors);
        colors.add("White");
        colors.add("Pink");
        Collections.sort(colors);
        System.out.println(colors);
        Collections.reverse(colors);
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println(colors);
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("-----------------------------");
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("-----------------------------");
            Player player = new Player("John", 23);
            Player player1 = new Player("Said",25);
            Player player2 = new Player("Max", 29);
            ArrayList<Object> objects = new ArrayList<>();
            objects.add(player);
            objects.add(player1);
            objects.add(player2);
        System.out.println(objects);
    }
}