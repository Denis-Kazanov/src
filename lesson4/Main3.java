package lesson4;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, как тебя зовут?");
        String answer = scanner.next();
        System.out.printf("%s", answer);
        System.out.println(" А сколько тебе лет");
        answer = scanner.next();

        int age = Integer.parseInt(answer);

        if (age < 10) {
            System.out.println("Ha, you are baby");
        } else if (age > 10 && age < 20) {
            System.out.println("School boy?");


        } else if (age > 20 && age < 40) {
            System.out.println("Оу ровестники");
        } else System.out.println("Я спать ");


    }
}
