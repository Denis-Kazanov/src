package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int side_a = 4;
        int side_b = 4;
        int side_c = 3;
        int side_d = 4;
        figure(side_a, side_b, side_c, side_d);

    }

    public static void figure(int side_a, int side_b, int side_c, int side_d) {
        if (side_a == side_b && side_a == side_c &&
                side_a == side_d &&
                side_b == side_c &&
                side_b == side_d &&
                side_c == side_d) {
            System.out.println("Квадрат или Ромб");

        } else if (side_a == side_c && side_b == side_d) {
            System.out.println("Прямоугольник или параллелограмм");


        } else System.out.println("Трапеция или четырехугольник");
    }
}
