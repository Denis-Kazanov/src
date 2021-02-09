package Super;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class ModelSuper {
    private static void reDraw(int indexI, int indexJ, char[][] field) {
        System.out.println("Ваш ход ячейка: [" + indexI + "] [" + indexJ + "]");
        field[indexI][indexJ] = '\u16B1';
        draw(field);
    }

    private static void reDrawDeath(int indexI, int indexJ, char[][] field) {
        System.out.println("Ваш ход ячейка: [" + indexI + "] [" + indexJ + "]");
        field[indexI][indexJ] = '\u2620';
        draw(field);
    }


    static boolean check(String map, HashMap<String, Boolean> bombIndex, char[][] field) {

        char[] indexs = map.toCharArray();
        int i = Character.digit(indexs[0], 10);
        int j = Character.digit(indexs[1], 10);
        boolean checkEarly = false;
        if (field[i][j] == '\u16B1' || field[i][j] == '\u2620') {
            checkEarly = true;
            System.out.println("Ячейка была проверена ранее, выберите другую");
            return true;
        }
        if (!checkEarly) {
            boolean check = bombIndex.get(map);
            if (check) {
                reDrawDeath(i, j, field);

                System.out.println("Вы проиграли =(");
                return false;

            } else {
               bombIndex.remove(map);


                reDraw(i, j, field);
                if (!bombIndex.containsValue(false)) {
                    System.out.println("Все бомбы найдены");
                    System.out.println("Поздравляю вы победили!!!");
                    return false;
                }
            }
        }
return true;
    }

    static void draw(char[][] arg) {
        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                if (i == 0) {
                    System.out.print(" " + arg[i][j] + " ");
                } else
                    System.out.print(" " + arg[i][j] + " ");
            }
            System.out.println();
        }
    }

    static char[][] createFiled(int difficult) {
        int lenOfArray = 0;
        if (difficult == 0) {
            lenOfArray = 4;
        } else if (difficult == 1) {
            lenOfArray = 7;
        } else lenOfArray = 10;

        char[][] arr = new char[lenOfArray][lenOfArray];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j == 0) {
                    arr[i][j] = '\u00A9';
                } else if (i == 0 && j >= 1) {
                    arr[i][j] = Character.forDigit(j, 10);
                } else if (i >= 1 && j < 1) {
                    arr[i][j] = Character.forDigit(i, 10);
                } else {
                    arr[i][j] = '\u25A0';
                }
            }
        }
        return arr;
    }

    static HashMap<String, Boolean> bombs(char[][] field) {
        int countBombs = field.length - 1;

        HashMap<String, Boolean> game = new HashMap<>();
        for (int i = 1; i < field.length; i++) {
            for (int j = 1; j < field[i].length; j++) {
                StringBuffer str = new StringBuffer();

                str.append(i);
                str.append(j);
                int random = ThreadLocalRandom.current().nextInt(0, 2);

                if (random == 0 && countBombs > 0) {
                    game.put(str.toString(), true);
                    countBombs--;
                } else game.put(str.toString(), false);
                if (i == field.length && !game.containsValue(true)) {
                    game.put(str.toString(), true);
                }
            }
        }
        return game;
    }
}
