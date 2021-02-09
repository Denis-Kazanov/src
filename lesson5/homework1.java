package lesson5;

import java.util.ArrayList;

public class homework1 {
    public static void main(String[] args) {
        String text = "У меня все хорошо, и замечательно все получается";
        char[] arr_ru = {'а', 'е', 'ё', 'и',
                'о', 'у', 'э', 'ю', 'я', 'ы', 'Ы', 'А', 'Е', 'Ё', 'И',
                'О', 'У', 'Э', 'Ю', 'Я'};
        char[] arrCh = text.toCharArray();
        ArrayList<Character> chList = test(arrCh, arr_ru);
        System.out.println("Задание 1 и 2:");
        System.out.println("Гласные буквы: " + task(arrCh, arr_ru) + "\nКоличество гласных букв: " + task(arrCh, arr_ru).length()); //Через стринг баффер.
        //   System.out.println("Гласные буквы: " + chList + "\nКоличество гласных букв: " + chList.size()); //Решение через список символов.
        String text2 = task2(arrCh);
        System.out.println("Задание 3:");
        System.out.println(text2);
        String text3 = task3(text2, arr_ru);
        System.out.println("Задание 4:");
        System.out.println(text3);

    }

    static ArrayList<Character> test(char[] arg1, char[] arg2) { //Через список символов.
        ArrayList<Character> test = new ArrayList<>();
        for (int i = 0; i < arg1.length; i++) {
            for (int x = 0; x < arg2.length; x++) {
                if (arg1[i] == arg2[x]) {
                    test.add(arg1[i]);
                    break;
                }
            }
        }
        return test;
    }

    static String task2(char[] arg1) {
        StringBuffer s1 = new StringBuffer();
        for (int i = arg1.length - 1; i >= 0; i--) {
            s1.append(arg1[i]);
        }
        String text = s1.toString();
        return text;
    }

    static String task3(String arg1, char[] arg2) {
        String res = arg1;
        for (int i = 0; i < arg2.length; i++) {
            res = res.replace(arg2[i], '?');
        }
        return res;
    }

    static String task(char[] arg1, char[] arg2) {
        String s2 = new String();
        StringBuffer s1 = new StringBuffer();
        for (int i = 0; i < arg1.length; i++) {
            for (int x = 0; x < arg2.length; x++) {
                if (arg1[i] == arg2[x]) {
                    s1.append(arg1[i]);
                    break;
                }
            }
        }
        s2 = s1.toString();
        return s2;
    }
}
