package lesson3;

public class Homework1 {
    public static void main(String[] args) {
        int res = 0;
        int res2 = 0;

        System.out.println("Чётные числа в обратном порядке");
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Сумма чётных от 1 до 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                res += i;
            }
        }
        System.out.println(res );
        System.out.println("Сумма чисел от 20 до 100 делимые на 4 и 5");
        for (int i = 20; i <= 100; i++) {
            if (i % 5 == 0 && i % 4 == 0) {
                res2 += i;
            }
        }
        System.out.println(res2);
    }
}

