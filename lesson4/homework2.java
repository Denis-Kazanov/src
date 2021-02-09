package lesson4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес электроной почты");
        String mail = scanner.next();
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(mail);

        if(mat.matches()){

            System.out.println("Является имейлом");
        }else{

            System.out.println("Не является имейлом");
        }
    }

}
