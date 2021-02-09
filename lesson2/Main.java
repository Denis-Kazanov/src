package lesson2;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 1;

        double x = (double) (a+b+c)/ (double) 2;
        System.out.println(x);

        boolean isEqTriangle = a == b && a == c && b == c;
        System.out.println(isEqTriangle);

        boolean isRaznostor = a != b && a != c && b != c;
        System.out.println(isRaznostor);

        boolean isRavnobedr = (a == b && b!= c && c!= a) || (b ==c && c!=a && a!=b) ;

        System.out.println(isRavnobedr);



    }

}
