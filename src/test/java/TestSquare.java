import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.lang.Math.sqrt;

public class TestSquare {
    int sideLength = 6;
    Square squareTest = new Square(sideLength);
    @Test
    public void testIsSquare(){
        assertEquals(true, squareTest.isSquare());
    }
    @Test
    public void testGetWidth(){
        assertEquals(sideLength, squareTest.getWidth());
    }
    @Test
    public void testGetHeight(){
        assertEquals(sideLength, squareTest.getHeight());
    }
    @Test
    public void testGetArea(){
        double areaTest = sideLength * sideLength;
        assertEquals(areaTest, squareTest.getArea());
    }
    @Test
    public void testGetPerimeter(){
        double perimeterTest = (sideLength * 2) + (sideLength * 2);
        assertEquals(perimeterTest, squareTest.getPerimeter());
    }
    @Test
    public void testGetDiagonal(){
        double diagonalTest = sqrt((sideLength*sideLength)+(sideLength*sideLength));
        assertEquals(diagonalTest, squareTest.getDiagonal());
    }
}
