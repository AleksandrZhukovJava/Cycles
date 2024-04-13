public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("task 2");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("task 3");
        for (int i = 1; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("task 5");
        for (int i = 1804; i < 2096; i += 4) {
            if (i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("task 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("task 7");
        for (int i = 2; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("task 8");
        for (int i = 1, money = 29000; i <= 12; i++, money += 29000) {
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", i, money);
        }
        System.out.println();

        System.out.println("task 9");
        for (int i = 1, money = 0; i <= 12; i++) {
            money = (int) ((money + 29000) * 1.01);
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", i, money);
        }
        System.out.println();

        System.out.println("task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("2 * %s = %s%n", i, i * 2);
        }
    }
}