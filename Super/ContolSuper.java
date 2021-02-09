package Super;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContolSuper {
    public static int difficult;
    boolean alive = true;
    char[][] gameField;
    Scanner input;
    HashMap<String, Boolean> bombsIndex;


    ContolSuper() {
        alive = true;
        input = new Scanner(System.in);
        this.difficult = chooseDiff();
        gameField = ModelSuper.createFiled(difficult);
        bombsIndex = ModelSuper.bombs(gameField);
        infoAboutThisGame(gameField, difficult);
    }

    private void infoAboutThisGame(char[][] field, int difficult) {
        if (difficult == 0) {
            System.out.println("Уровень сложности: лёгкий \nКоличество бомб в игре: " + (field.length - 1));
        } else if (difficult == 1) {
            System.out.println("Уровень сложност: средний \nКоличество бомб в игре: " + (field.length - 1));
        } else System.out.println("Уровень сложности: сложный \nКоличество бомб в игре: " + (field.length - 1));
    }

    private int chooseDiff() {
        int diff;
        Pattern pattern = Pattern.compile("[0-2]");
        while (true) {
            System.out.println("Выберите уровень сложности \n 0-Лёгкий \n 1-Средний \n 2-Сложный");
            String ste = new String();
            ste = input.next();
            Matcher mat = pattern.matcher(ste);
            if (mat.matches()) {
                diff = Integer.parseInt(ste);
                return diff;
            } else System.out.println("Некорректный ввод");
        }
    }

    private static boolean checkInput(String str) {
        Pattern pattern;
        if (difficult == 0) {
            pattern = Pattern.compile("[1-3]");
        } else if (difficult == 1) {
            pattern = Pattern.compile("[1-6]");
        } else pattern = Pattern.compile("[1-9]");
        Matcher mat = pattern.matcher(str);
        if (mat.matches()) {
            return true;
        } else {
            System.out.println("Не корректный ввод, попробуйте ещё раз");
            return false;
        }
    }

    public void startGame() {
        ModelSuper.draw(gameField);
        while (alive) {
                 // System.out.println(bombsIndex); //Тест для отоброжения координат бомб
            StringBuffer str = new StringBuffer();
            String in = new String();
            System.out.println("Введите координату по вертикали");
            in = input.next();
            if (!checkInput(in)) {
                continue;
            }
            str.append(in);
            System.out.println("Введите координату по горизонатали");
            in = input.next();
            if (!checkInput(in)) {
                continue;
            }
            str.append(in);
            alive = ModelSuper.check(str.toString(), bombsIndex, gameField);


        }

    }

}
