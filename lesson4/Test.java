package lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String pass = "AbCd";
        Pattern pattern = Pattern.compile("[A-Za-z]");
        Matcher mat = pattern.matcher(pass);
        if (mat.matches()){
            System.out.println("Сложный");
        }else System.out.println("Простой");
    }
}
