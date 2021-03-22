import management.Manager;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;



    @Before
    public void before(){
        manager = new Manager("Jim Manage", "JM001", 30000, "TechHub");

    }

    @Test
    public void HasName(){
        assertEquals("Jim Manage", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JM001", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(30010, manager.raiseSalary(10), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(30300, manager.payBonus(), 0.1);
    }


}
