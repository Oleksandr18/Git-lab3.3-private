package javaStarter;

//  створіть клас Calculator. Створіть метод з ім'ям calculate,
//  який приймає як параметри три цілочислові значення та повертає значення кожного аргументу, поділеного на 5.


public class Lab8_4_Calculator {

    public static void calculate(int a, int b, int c){
        int r1 = a / 5;
        int r2 = b / 5;
        int r3 = c / 5;

        System.out.println("Результат 1: " + r1);
        System.out.println("Результат 2: " + r2);
        System.out.println("Результат 3: " + r3);
    }

    public static void main(String[] args) {
        calculate(25, 10, 50);


    }
}
