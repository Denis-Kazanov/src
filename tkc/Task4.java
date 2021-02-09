package tkc;

import java.util.ArrayList;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2=0;
        double kMax= 1;
        double aMax = 10;
        ArrayList<Double> numbers = new ArrayList<Double>();

        numbers.add((double) 99);
        numbers.add((double) 5);
        numbers.add((double) 85);



        for (int i = 0; i < numbers.size(); i++){
            sum1+= numbers.get(i);

        }
        Collections.sort(numbers);

        for (int i=0; i <kMax; i++){
            numbers.set(i, (double) aMax);
        }
        for (int i = 0; i < numbers.size(); i++){
            sum2+= numbers.get(i);}
        System.out.println(sum2-sum1);


    }
}
