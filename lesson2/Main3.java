package lesson2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int mark = vvod.nextInt();
        switch (mark) {
            case 2:
                System.out.println(mark);
                break; // Обязательно!!!! иначе тут дальше пойдет отрабатывать пока до break не дойдет либо все case не выолнит
            case 3:
                System.out.println(mark);
                break; // Обязательно!!!!
            case 4:
                System.out.println(mark);
                break; // Обязательно!!!!
            case 5:
                System.out.println(mark);
                break; // Обязательно!!!!
            default:
                System.out.println("Not mark");
        }


    }

}
