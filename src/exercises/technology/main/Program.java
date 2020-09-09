package exercises.technology.main;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Program {

    public Computer oldPc;
    public Computer newPc;
    public Laptop myLaptop;
    public SmartPhone myPhone;

    @Before
    public void testObjects() {
        oldPc = new Computer("Acer", 2010, 8);
        newPc = new Computer("Lenovo", 2019, 32);
        myLaptop = new Laptop("Lenovo",2019, 24, 15);
        myPhone = new SmartPhone("Samsung", 2016, 32, "T-Mobile");
    }

    @Test
    public void abstractEntitySetsId() {
        assertTrue(oldPc.getId() < newPc.getId());
    }

    @Test
    public void computerGetsAge() {
        assertEquals(newPc.age(), 1);
    }

    @Test
    public void computerMemoryRemaining() {
        assertTrue(newPc.getMemory()-16 == 16.0);
    }

    @Test
    public void laptopBiggerThan() {
        assertTrue(myLaptop.biggerThan(14));
    }

    @Test
    public void smartPhoneChangesCarrier() {
        myPhone.changeCarrier("Verizon");
        String newCarrier = myPhone.getCarrier();
        assertTrue(newCarrier.matches("Verizon"));
    }

    @Test
    public void computerToString() {
        assertTrue(oldPc.toString().matches("Manufactured by: Acer\nDate: 2010"));
    }

}

