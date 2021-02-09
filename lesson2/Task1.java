package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = vvod.nextInt();
        evenOrNot(num);
        System.out.println();
    }
    public static void evenOrNot(int num){

        if ((num % 2)==0){
            System.out.println(num + " чётное");
        } else System.out.println(num + " нечётное");


    }
}
