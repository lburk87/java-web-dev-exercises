package exercises.technology.main;

import java.util.Calendar;

public class Computer extends AbstractEntity {

    private String manufacturer;
    private int yearMade;
    private double memory;

    public Computer(String manufacturer, int yearMade, double memory) {
        this.manufacturer = manufacturer;
        this.yearMade = yearMade;
        this.memory = memory;
    }

    public int age(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - this.yearMade;
        return age;
    }

    public double memoryRemaining(double appMb) {
        this.memory = this.memory - appMb;
        return this.memory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearMade() {
        return yearMade;
    }

    public double getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Manufactured by: "+this.manufacturer+ "\nDate: "+this.yearMade;
    }
}
