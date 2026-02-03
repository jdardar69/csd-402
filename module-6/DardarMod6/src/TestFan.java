package com.example.dardarmod6;

public class TestFan {

    public static void main(String[] args) {

        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan();

        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);

        fan2.setOn(true);
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(7.5);
        fan2.setColor("blue");

        System.out.println("Fan 2 updated: " + fan2);
    }
}
