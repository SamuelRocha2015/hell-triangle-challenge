import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HellsTriangleTest {

    @Test
    public void hellsTriangleTest(){
        int[][] triangle = {{6}, {3,5}, {9, 7, 1}, {4, 6, 8, 4}};
        assertEquals(26, HellsTriangle.maximumTotal(triangle));
    }

    @Test
    public void hellsTriangleNullTest(){
        int[][] triangle = null;
        assertEquals(0, HellsTriangle.maximumTotal(triangle));
    }

    @Test
    public void hellsTriangleOneElementTest(){
        int[][] triangle = {{6}};
        assertEquals(6, HellsTriangle.maximumTotal(triangle));
    }
}
