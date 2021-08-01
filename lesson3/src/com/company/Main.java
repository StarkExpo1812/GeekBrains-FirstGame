package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ваша задача угадать число.");
        for(int i = 10; i <= 30; i += 10) playlevel(i);
        System.out.println("Вы выйиграли!");
        scanner.close();
    }
    private static void playlevel(int range) {
        int numder = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == numder) {
                System.out.println("Вы угадали число.");
                break;
            } else if (input_number > numder) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }
        }
    }
}
