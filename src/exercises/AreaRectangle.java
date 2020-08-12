package exercises;
import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length:");
        float length = input.nextFloat();
        System.out.println("Width:");
        float width = input.nextFloat();
        System.out.println("Area: " + length*width);
    }

}
