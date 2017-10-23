import org.junit.Test;
import static org.junit.Assert.*;

public class Exercise3Test {

    @Test
    public void triangleTest5() throws Exception {
        int result = Exercise3.triangle(5);
        assertEquals(15, result);
    }

    @Test
    public void triangleTest10() throws Exception {
        int result = Exercise3.triangle(10);
        assertEquals(55, result);
    }

    @Test
    public void triangleTest0() throws Exception {
        int result = Exercise3.triangle(0);
        assertEquals(0, result);
    }

    @Test
    public void lazyCatererTest5() throws Exception {
        int result = Exercise3.lazyCaterer(5);
        assertEquals(16, result);
    }

    @Test
    public void lazyCatererTest10() throws Exception {
        int result = Exercise3.lazyCaterer(10);
        assertEquals(56, result);
    }

    @Test
    public void lazyCatererTest0() throws Exception {
        int result = Exercise3.lazyCaterer(0);
        assertEquals(1, result);
    }
}