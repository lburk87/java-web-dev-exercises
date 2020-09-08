package exercises.technology;

public class Computer {

    private String manufacturer;
    private double serialNumber;
    private int memory;

    public Computer(String manufacturer, double serialNumber, int memory) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.memory = memory;
    }

    public Computer(String manufacturer, double serialNumber) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

}
