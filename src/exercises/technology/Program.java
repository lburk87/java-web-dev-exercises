package exercises.technology;

public class Program {

    public static void main(String[] args) {

        Laptop myLaptop = new Laptop("Lenovo",2019, 24, 15);
        System.out.println(myLaptop.biggerThan(16));
        Computer someComputer = new Computer("HP", 2015, 164);
        System.out.println(someComputer.memoryRemaining(15.05));

    }
}
