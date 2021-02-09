package lesson3;

public class Main3 {
    public static void main(String[] args) {
        for (int i = 100; i<=150; i++){
            if (i%3==0 && i%5==0){
                System.out.println(i);
            }

        }
        int i = 100;
        while (i <=150){
            if (i%3==0 && i%5==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
