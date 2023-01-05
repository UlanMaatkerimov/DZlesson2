package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(concat(25, 15));
        System.out.println(concat(5, 25));
        System.out.println(concat(40, 45));
        System.out.println(concat(10, 20));
        System.out.println(concat(15, -15));

        System.out.println(generateRandomAge(5, 18) + " лет. " + " Можно ли идти гулять?");

    }

    public static String concat(int age, int temp) {
        String result = "Можно идти гулять";
        String result2 = "Оставайтесь дома";

        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return result;
        } else if (age < 20 && temp >= 0 && temp <= 28) {
            return result;
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            return result;
        } else {
            return result2;
        }

    }

    public static int generateRandomAge(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;

    }
}
