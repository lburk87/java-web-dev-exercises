package exercises;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        List<String> list = Arrays.asList(str.split(" "));
        Scanner input = new Scanner(System.in);
        System.out.println("Word search length:");
        int length = input.nextInt();

        for (String i : list) {

            if (i.length() == length) {
                System.out.println(i);
            }

        }

    }

}

