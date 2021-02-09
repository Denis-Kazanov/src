package lesson3;


public class Main6 {
    public static void main(String[] args) {
        for (int i = 10; i >= -500; i--) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println(i);

            }

        }
    }
}
