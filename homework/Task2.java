package homework;

public class Task2 {
    public static void main(String[] args) {
        double side_a = 4;
        double side_b = 4;
        double side_c = 5;
        System.out.println("Данн треугольник со строронами а=" + side_a + " b=" +side_b+" c="+side_c);
        area(side_a, side_b, side_c);


    }

    static void area(double side_a, double side_b, double side_c) { //Метод вычисляет площадь
        double half_meter = (side_a + side_b + side_c) * .5;
        double s = half_meter*(half_meter-side_a)*(half_meter-side_b)*(half_meter-side_c); //Вычисление площади без корня
        double result = Math.sqrt(s); //Вычисление корня
        System.out.println("Площадь треугольника равна " + result);

    }


}
