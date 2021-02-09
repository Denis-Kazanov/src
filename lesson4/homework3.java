package lesson4;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пароль должен состоять не менее чем из 8 символов. Используйте разных регистр и специальные символы");
        while (true) {
            System.out.println("Введите пароль:");
            String password = scanner.next();
            char[] arrayPass = password.toCharArray();
            if (arrayPass.length < 8) {
                System.out.println("Пароль ненадёжный, мало символов");
            } else if (!checkABS(arrayPass)) {
                System.out.println("Пароль ненадёжный, нет букв");
            } else if (!checkLower(arrayPass) || !checkUpper(arrayPass)) {
                System.out.println("Пароль ненадёжный, используйте буквы  разных регистров");
            } else if (!checkSymbols2(arrayPass)) {
                System.out.println("Пароль ненадёжный, используйте специальные символы (!,%,+ и т.д)");
            } else {
                System.out.println("Пароль надёжный");
                break;
            }
        }

    }

    static boolean checkABS(char[] sym) { //Проверяет есть ли буквы
        boolean okOrnot = true;
        for (char s : sym) {
            if (Character.isLetter(s)) {
                okOrnot = true;
                break;
            } else okOrnot = false;
        }

        return okOrnot;
    }

    static boolean checkUpper(char s[]) { // Проверяет есть ли ВЕРХНИЙ регистр
        boolean okOrnot = false;
        for (int i = 0; i < s.length; i++) {
            if (Character.isUpperCase(s[i])) {
                okOrnot = true;
                break;
            }
        }
        return okOrnot;
    }

    static boolean checkLower(char s[]) { // Проверяет есть ли ВЕРХНИЙ регистр
        boolean okOrnot = false;
        for (int i = 0; i < s.length; i++) {
            if (Character.isLowerCase(s[i])) {
                okOrnot = true;
                break;
            }
        }
        return okOrnot;
    }

    static boolean checkSymbols2(char s[]) {//Проверяет есть ли символ
        boolean okOrnot = false;
        char[] sym = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=',
                ';', ':', ',', '.', '/', '?', '|', '`', '[', ']', '"', '<', '>', '№'};
        for (int i = 0; i < s.length; i++) {
            for (int x = 0; x < sym.length; x++) {
                if (s[i] == sym[x]) {
                    okOrnot = true;
                    break;
                }
            }

        }
        return okOrnot;
    }
}
