package lesson6;

import java.util.HashMap;
import java.util.Scanner;

public class Super {
    public static void main(String[] args) {
        char[][] test = new char[3][3];
        System.out.println(test);
        HashMap<String, String> game = new HashMap<>();
        game.put("00", "Пусто");
        game.put("01","Пусто");
        game.put("10","Пусто");
        game.put("11","Бомба");
        Scanner vvod= new Scanner(System.in);
        String check = vvod.next();
        char [] name = check.toCharArray();
        for(int i=0; i <name.length; i++){
            System.out.println(name[i]);
        }
        StringBuffer str = new StringBuffer();
        String str1 = new String();
        str1 += vvod.next();
        str1 += vvod.next();
        System.out.println(str1);
        System.out.println(game.get(str1));


    }
}
