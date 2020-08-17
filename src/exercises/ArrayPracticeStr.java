package exercises;

import java.util.Arrays;

public class ArrayPracticeStr {

    public static void main(String[] args) {
        String str ="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
        String[] strArr2 = str.split("\\.");
        System.out.println(Arrays.toString(strArr2));
    }
}
