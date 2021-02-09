package homework;

public class Task1 {
    public static void main(String[] args) {
        double length_room = 4; //Длина комнаты
        double width_room = 7.5; //Ширина комнаты
        double length_table = 1; //Длина стола
        double width_table = 2; // Ширина стола
        System.out.println("Длина команты=" + length_room + " Ширина команты=" +width_room);
        System.out.println("Длина стола=" + length_table + " Ширина стола=" + width_table);
        tables(length_room,width_room, length_table,width_table); // Ответ на задачу.
    }


    static void tables(double length_room, double width_room, double length_table, double width_table) {
        int a = (int) (length_room / length_table);
        int b = (int) (width_room / width_table);
        int result = (int) (a * b);
        System.out.println("В комнате поместиться " + result + " столов"); //Уточнить аналог "текст {}".format(result) в java


    }

}
