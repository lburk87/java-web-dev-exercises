package exercises;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("miles driven:");
        float miles = input.nextFloat();
        System.out.println("gas used:");
        float gas = input.nextFloat();
        System.out.println("miles per gallon:" + miles/gas);
    }
}
