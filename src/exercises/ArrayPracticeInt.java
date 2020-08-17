package exercises;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPracticeInt {

    public static void main(String[] args) {
        int[] values = new int[]{1, 1, 2, 3, 5, 8};
        for (int i : values) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
