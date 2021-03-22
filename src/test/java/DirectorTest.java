import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Eilidh Q", "EQ001", 35000, "EQVS", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Eilidh Q", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("EQ001", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, director.getSalary());
    }

    @Test
    public void hasDept(){
        assertEquals("EQVS", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(100, director.getBudget(),0.1);
    }
}
