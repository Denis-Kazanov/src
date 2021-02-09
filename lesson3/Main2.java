package lesson3;

public class Main2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 120; i ++){
            if (i%2== 0){
                System.out.println(i);
            }
        }
        int i = 100;
        while (i<=120){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }

    }
}