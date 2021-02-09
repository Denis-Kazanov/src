package lesson4;

public class Main {
    public static void main(String[] args) {
        int[] num = {10, 11, 50, 60};
        int test = (int) (Math.random()*10);
        System.out.println(test);
        for (int i : num){
            System.out.println(i);
        }
        int[] num2 = test(10);
        System.out.println(num);
        for (int i :num2){
            System.out.println(i);
        }



    }













    static int[] test(int num){
        int[] m = new int[num];

        for (int i = 0; i < m.length; i++ ){
           m[i] = (int) (Math.random()*10);
        }
        return  m;

    }

}
