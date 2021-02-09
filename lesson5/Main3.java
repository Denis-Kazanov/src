package lesson5;

public class Main3 {
    public static void main(String[] args) {
        String goodWeather = "В январе хороша погода";
        String[] test = goodWeather.split(" ");
        String good = new String();
        StringBuffer buf = new StringBuffer();
        for(int i = test.length-1; i>=0; i--){
            buf.append(" " + test[i]);
        }
        good = buf.toString();
        System.out.println(good);


    }
}
