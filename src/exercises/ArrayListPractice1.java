package exercises;

import java.util.Arrays;
import java.util.List;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        double evenSum = 0;
        for (int i : list) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        double average = evenSum;

        System.out.println("Sum of evens = " + evenSum);
    }
}



