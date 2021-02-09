package lesson4;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону a");
        double side_a = scanner.nextInt();
        System.out.println("Введите сторону b");
        double side_b = scanner.nextInt();
        System.out.println("Введите сторону c");
        double side_c=scanner.nextInt();
        double s = area(side_a, side_b, side_c);
        double p = perimeter(side_a,side_b, side_c);
        System.out.printf("Периметр треугольника равен: %s\nПлощадь треугольника равна %s",p,s);



    }
        static double area(double a, double b, double c){
            double half_meter = (a + b + c) * .5;
            double s = half_meter*(half_meter-a)*(half_meter-b)*(half_meter-c);
            double result = Math.sqrt(s);
            return result;

        }
        static double perimeter(double a, double b, double c){
            return a+b+c;


        }
}

