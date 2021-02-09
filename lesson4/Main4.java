package lesson4;

//Бонусом доделать проверку пароля на символы.//\/
// < 8
// одну заглавную сложный
// спец символы
// Вообще доработать правильную логику проверку пароля.


// 3 стороны с клавиатуры. Вывести на консоль площадь и периметр
// Введите mail   (Проверять mail это или не мэйл) .

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль ");
        String answer = scanner.next();
        if (answer.length() <= 8) {
            System.out.println("To Eazy");
        }
             if (answer.contains("!") || answer.contains("@")){
               System.out.println("Средненький ");
         }

    }
}
