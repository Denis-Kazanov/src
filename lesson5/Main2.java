package lesson5;

public class Main2 {
    public static void main(String[] args) {
        String mail = "dsjfgdf@mail.ru";
        if (!mail.contains("@")){
            System.out.println("Не мейл");
            return; // прервать дальнейшие проверки

        }else if (mail.startsWith(".") || mail.endsWith(".")) {
            System.out.println("Тоже не мейл");
            return;
        }
        String[] check = mail.split("@");
        if(check.length != 2){
            System.out.println("не мейл");
            return;
        }

        if (!check[1].contains(".")){
            System.out.println("Неверный мейл");
            return;



        }

            System.out.println("Корректный");
//        int i = -1;
//        if (i == check[1].indexOf('.')){
//            System.out.println("Не мейл");
//        }


    }
}
