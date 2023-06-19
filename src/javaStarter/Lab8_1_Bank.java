package javaStarter;

//  створіть клас Bank. Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити, погасив клієнт кредит чи ні.
//  Припустимо, щомісячна сума платежу має становити 100 грн. Клієнт має виконати 7 платежів, але може платити рідше великими сумами.
//  Тобто може двома платежами по 300 і 400 грн закрити весь борг.
//  Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку.
//  Метод виводить на екран інформацію про стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу).

public class Lab8_1_Bank {
    public static int remainingDebt;
    public static int totalPayments;

    public static int makePayment(int toPay){
        remainingDebt = 700;        //оставшийся долг
        totalPayments = 0;          //Всего платежей

        int remainingPay = 7;               //оставшаяся оплата


        if(toPay >= remainingDebt){
            System.out.println("Борг погашений.");
            System.out.println("Сума переплати: " + (toPay - 700) + " грн");
        } else if(toPay <= remainingDebt) {
            remainingDebt -= toPay;
            System.out.println("Залишок боргу: " + remainingDebt + " грн");
            totalPayments++;
        } else if (remainingDebt <= 0) {
            System.out.println("Борг повністю погашений.");
        }

        return remainingPay;
    }

    public static void main(String[] args) {

        int pay1 = makePayment(300);
        int pay2 = makePayment(400);

    }
}
