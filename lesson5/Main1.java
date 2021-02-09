package lesson5;

public class Main1 {
    public static void main(String[] args) {
        String s1 = "qwe123qwe345qwe678147qwe154171qwe213345qswe";
        String s2 = "qwe";
        StringBuffer s = new StringBuffer(s1);
        int p;

        while ((p = s.toString().indexOf(s2)) >= 0 ){
            System.out.println(s.toString().indexOf(s2));
            System.out.println(s);
            s.delete(p , p +s2.length());


        }
        s1 = s.toString();
        System.out.println(s1);
        System.out.println(s.toString().indexOf(s2));





    }
}
