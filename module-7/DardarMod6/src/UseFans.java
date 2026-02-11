/**
 * Name: Jordan Dardar
 * Course: CSD-402 Java for Programmers
 * Module: 7.2 Programming Assignment
 * Description: Creates a collection of Fan objects and displays them without using toString().
 */

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    public static void main(String[] args) {

        List<Fan> fans = new ArrayList<>();

        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 8, "blue");
        Fan fan3 = new Fan(Fan.SLOW, true, 6.5, "black");
        Fan fan4 = new Fan(Fan.STOPPED, false, 7, "white");

        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        displayFans(fans);

        System.out.println("\nSingle Fan Display:");
        displayFan(fan2);
    }

    public static void displayFans(List<Fan> fans) {
        System.out.println("Fan Collection Display");
        System.out.println("----------------------");

        for (int i = 0; i < fans.size(); i++) {
            System.out.println("Fan #" + (i + 1));
            displayFan(fans.get(i));
            System.out.println();
        }
    }

    public static void displayFan(Fan fan) {
        System.out.println("  On: " + fan.isOn());
        System.out.println("  Speed: " + speedName(fan.getSpeed()) + " (" + fan.getSpeed() + ")");
        System.out.println("  Color: " + fan.getColor());
        System.out.println("  Radius: " + fan.getRadius());
    }

    private static String speedName(int speed) {
        if (speed == Fan.STOPPED) return "STOPPED";
        if (speed == Fan.SLOW) return "SLOW";
        if (speed == Fan.MEDIUM) return "MEDIUM";
        if (speed == Fan.FAST) return "FAST";
        return "UNKNOWN";
    }
}
