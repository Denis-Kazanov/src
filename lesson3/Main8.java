package lesson3;

public class Main8 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 7;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println(i);
                if (i >= 100) {
                    break;
                }
            }
        }
    }
}

