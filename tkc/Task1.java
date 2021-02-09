package tkc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;
        int kMax = 2;
        int aMax = 9;
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        for (int i = 0; i < numbers.size(); i++) {
            sum1 += numbers.get(i);
        }
        Collections.sort(numbers);
        for (int i = 0; i < kMax; i++) {
            numbers.set(i, aMax);
        }
        for (int i = 0; i < numbers.size(); i++) {
            sum2 += numbers.get(i);
        }
        System.out.println(sum2 - sum1);

    }
}
