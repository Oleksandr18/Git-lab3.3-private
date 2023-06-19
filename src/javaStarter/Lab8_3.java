package javaStarter;

//Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних,
// створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.

public class Lab8_3 {

    public static double pov1(double a, double b, double c){
        return (a + b + c) / 3.0;
    }
    public static double pov2(double a, double b, double c, double d){
        return (a + b + c + d) / 4.0;
    }
    public static double pov3(double a, double b, double c, double d, double e){
        return (a + b + c + d + e) / 5.0;
    }

    public static int minMaxAvg(int a, int b, int c){
        double avg = pov1(a, b, c);
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);

        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Середнє значення: " + avg);
        return min;
    }

    public static int minMaxAvg(int a, int b, int c, int d){
        double avg = pov2(a, b, c, d);
        int min = (int) Math.min(Math.min(Math.min(a, b), c), d);
        int max = (int) Math.max(Math.max(Math.max(a, b), c), d);

        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Середнє значення: " + avg);
        return min;
    }

    public static int minMaxAvg(int a, int b, int c, int d, int e){
        double avg = pov3(a, b, c, d, e);
        int min = (int) Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        int max = (int) Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);

        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Середнє значення: " + avg);
        return min;
    }


    public static void main(String[] args) {
        double n1 = minMaxAvg(1, 9, 7);
        double n2 = minMaxAvg(3, 5, 17, 11);
        double n3 = minMaxAvg(5, 13, 7, 14, 10);


    }
}
