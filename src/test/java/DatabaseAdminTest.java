import org.junit.Before;
import org.junit.Test;
import techStuff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Gary Data", "GD003", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Gary Data", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("GD003", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, databaseAdmin.getSalary());
    }

    @Test
    public void raiseSalary(){
        assertEquals(40500, databaseAdmin.raiseSalary(500), 1);
    }

    @Test
    public void payBonus(){
        assertEquals(40400, databaseAdmin.payBonus(), 0.1);
    }
}
