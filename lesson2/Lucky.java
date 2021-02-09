package lesson2;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = vvod.nextInt();
        char [] chars = ("" + num).toCharArray();

        int res = 0;
        int res2 = 0;
        if (chars.length > 6){
            System.out.println("Не корректное число");
        }else{
            for (int i = 0; i<3; i++){
                res += chars[i];
            }
            for (int i =3; i<6; i++){
                res2 += chars[i];
            }
            if (res == res2){
                System.out.println("Счастливый билет");
            }else System.out.println("Нет");
        }





    }

}
