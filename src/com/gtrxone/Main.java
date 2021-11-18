package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Day is Sunday");
            case 1 -> System.out.println("Day is Monday");
            case 2 -> System.out.println("Day is Tuesday");
            case 3 -> System.out.println("Day is Wednesday");
            case 4 -> System.out.println("Day is Thursday");
            case 5 -> System.out.println("Day is Friday");
            case 6 -> System.out.println("Day is Saturday");
            default -> System.out.println("Invalid Day");
        }


    }
}
