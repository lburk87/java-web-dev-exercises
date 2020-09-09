package exercises.technology.main;

public class Laptop extends Computer {

    private double size;

    public Laptop(String manufacturer, int yearMade, double memory, double size) {
        super(manufacturer, yearMade, memory);
        this.size = size;
    }

    public boolean biggerThan(double inches) {
        return (this.size > inches);
    }

}
