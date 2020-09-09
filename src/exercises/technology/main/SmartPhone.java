package exercises.technology.main;

public class SmartPhone extends Computer {

    private String carrier;

    public SmartPhone(String manufacturer, int yearMade, double memory, String carrier) {
        super(manufacturer, yearMade, memory);
        this.carrier = carrier;
    }

     public void changeCarrier(String newCarrier){
        this.carrier = newCarrier;
     }


    public String getCarrier() {
        return carrier;
    }
}
