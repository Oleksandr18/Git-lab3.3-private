package javaStarter;

//  Є N клієнтів, яким компанія-виробник має доставити товар. Скільки є можливих маршрутів доставлення товару з урахуванням того,
//  що товар доставлятиме одна машина? Використовуючи IntelliJ IDEA, створіть клас Delivery. Напишіть програму,
//  яка розраховуватиме та виводитиме на екран кількість можливих варіантів доставлення товару.
//  Для розв'язку задачі, використовуйте факторіал N!, що розраховується рекурсією.

//  Поясніть, чому не рекомендується використовувати рекурсію для розрахунку факторіала. Вкажіть слабкі місця цього підходу.
//  Відповідь: 1) Споживання пам'яті; 2) час виконання, виконує багато зайвих обчислень.

import java.util.Scanner;

public class Lab8_2_Delivery {

    public static int Routes(int clients){

        if(clients == 0 || clients == 1){
            return 1;
        } else {
            return clients * Routes(clients - 1);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfClients = sc.nextInt();
        int possibleRoutes = Routes(numberOfClients);

        System.out.println("Кількість можливих варіантів доставки: " + possibleRoutes);
    }

}
