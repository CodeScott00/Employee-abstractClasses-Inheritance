import org.junit.Before;
import org.junit.Test;
import techStuff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Scott D", "SD666", 100000);
    }

    @Test
    public void getName(){
        assertEquals("Scott D", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("SD666", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(102000, developer.raiseSalary(2000), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(101000, developer.payBonus(), 0.1);
    }
}
