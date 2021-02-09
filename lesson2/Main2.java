package lesson2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int mark = vvod.nextInt();
        if (mark == 2) {
            System.out.println("Vary baaaad");

        } else if (mark == 3) {
            System.out.println("Not baad");

        } else if (mark == 4) {
            System.out.println("Good job");
        } else if (mark == 5) {
            System.out.println("Vary good job");
        } else {System.out.println("Wtf");}

    }


}
