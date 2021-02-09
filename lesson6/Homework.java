package lesson6;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

       draw();
       System.out.println();
       draw2();
        System.out.println();
       draw3();
       enterTheMatrix();//Бонусом
    }

    public static void draw() {
        int[][] arr = new int[4][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j == 3) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 1 && j >= 2 && j < 5) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 2 && j >= 1 && j < 6) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 3) {
                    System.out.print(arr[i][j] + " ");
                } else System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }

    public static void draw2() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j == 3) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 1 && j >= 2 && j < 5) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 2 && j >= 1 && j < 6) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 3) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 4 && j >= 1 && j < 6) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 5 && j >= 2 && j < 5) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 6 && j == 3) {
                    System.out.print(arr[i][j] + " ");
                } else System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }

    public static void draw3() {
        int[][] arr = new int[9][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j >= 3 && j < 5) {
                    System.out.print(arr[i][j] + " ");
                } else if (i >= 1 && i < 3 && j >= 2 && j < 6) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 3 && j >= 1 && j < 7) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 4) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 5 && j >= 1 && j < 7) {
                    System.out.print(arr[i][j] + " ");
                } else if (i >= 6 && i < 8 && j >= 2 && j < 6) {
                    System.out.print(arr[i][j] + " ");
                } else if (i == 8 && j >= 3 && j < 5) {
                    System.out.print(arr[i][j] + " ");
                } else System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }
    public static void enterTheMatrix() throws InterruptedException {
        String str = " ";
        Boolean end = false;
        String GREEN = "\u001b[32m";
        System.out.println("Wake up Neo....");
        Thread.sleep(5000);
        System.out.println(GREEN);
        char[] arr_ru = {'а', 'е', 'ё', 'и',
                'о', 'у', 'э', 'ю', 'я', 'ы', 'Ы', 'А', 'Е', 'Ё', 'И',
                'О', 'У', 'Э', 'Ю', 'Я', 'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','Q','W','E'
                ,'R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M','1','2','3','4','5','6','7','8','9','0'};
        for (int i =0; i<=200; i++){
            if (i%2 == 0){
                str = "";
                for (int j =0; j<79; j++){
                    int n = (int) (Math.random()*7);
                    if (n<2){
                    int m = (int) (Math.random()*arr_ru.length-1);
                        str += arr_ru[m];

                    }else if (i == 200){
                        end = true;
                    }
                    else {
                        str += " ";
                    }
                }

            }
           System.out.println(str);
            if (end){ //Костыль
                System.out.println("0   0     0    00000   000    0   0    0");
                System.out.println("00 00    0 0     0     000         0  0");
                System.out.println("0 0 0    000     0     000    0     00  ");
                System.out.println("0 0 0   0   0    0     00     0     00  ");
                System.out.println("0   0   0   0    0     0 0    0    0  0 ");
                System.out.println("0   0   0   0    0     0  0   0   0    0");
            }
            Thread.sleep(30);
        }
    }



}
