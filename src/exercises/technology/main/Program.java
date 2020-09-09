package exercises.technology.main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Program {

    public Computer oldPc;
    public Computer newPc;
    public Laptop myLaptop;

    @Before
    public void testObjects() {
        oldPc = new Computer("Acer", 2010, 8);
        newPc = new Computer("Lenovo", 2019, 32);
        myLaptop = new Laptop("Lenovo",2019, 24, 15);
        new SmartPhone("Samsung", 2016, 32, "T-Mobile");
    }

    @Test
    public void computerGetsAge() {
        assertEquals(newPc.age(), 1);
    }

    @Test
    public void abstractEntitySetsId() {
        assertTrue(oldPc.getId() < newPc.getId());
    }

    @Test
    public void computerMemoryRemaining() {
        assertTrue(newPc.getMemory()-16 == 16.0);
    }

    @Test
    public void laptopBiggerThan() {
        assertTrue(myLaptop.biggerThan(14));
    }

}

