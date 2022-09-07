public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Домашнее задание - 1. Задание 1");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Домашнее задание - 1. Задание 2");
        for (int i = 10; i > 0; i-- ){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Домашнее задание - 1. Задание 3");
        for (int i = 0; i <= 17; i += 2){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Домашнее задание - 1. Задание 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Домашнее задание - 2. Задание 1");
        for (int i = 1904; i <= 2096; i+=4)
        {System.out.println(+ i + " год является високосным.");}
        System.out.println();
        System.out.println("Домашнее задание - 2. Задание 2");
        for (int i = 7; i <= 98; i +=7){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Домашнее задание - 2. Задание 3");
        for (int i = 1; i <=512; i *= 2)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Домашнее задание - 3. Задание 1");
        int ante = 29000; // ежемесячная нычка
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + ante;
            System.out.println("Месяц " + i + " - накопленная сумма равна " + total + " рублей.");
        }
        System.out.println("Сумма накопленная за год равна " + total + " рублям.");
        System.out.println();
        System.out.println("Домашнее задание - 3. Задание 2");
        int contribution = 29000;// ежемесечное вложение на банковский счет
        int totalContribution = 0;
        for (int i = 1; i <= 12; i++) {
            totalContribution = totalContribution + totalContribution/100;
            totalContribution = totalContribution + contribution;
            System.out.println("Месяц " + i + " - сумма накоплений с процентами составляет " + totalContribution + " рублей.");
        }
    }
}
