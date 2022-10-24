import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static java.lang.Math.sqrt;

public class TestRectangle {
    int width = 3, height = 4;
    Rectangle rectangleTest = new Rectangle(width, height);
    @Test
    public void testGetWidth(){
        assertEquals(width, rectangleTest.getWidth());
    }
    @Test
    public void testGetHeight(){
        assertEquals(height, rectangleTest.getHeight());
    }
    @Test
    public void testGetArea(){
        double areaTest = width * height;
        assertEquals(areaTest, rectangleTest.getArea());
    }
    @Test
    public void testGetPerimeter(){
        double perimeterTest = (width * 2) + (height * 2);
        assertEquals(perimeterTest, rectangleTest.getPerimeter());
    }
    @Test
    public void testGetDiagonal(){
        double diagonalTest = sqrt((width*width)+(height*height));
        assertEquals(diagonalTest, rectangleTest.getDiagonal());
    }
    @Test
    public void testIsRectangle(){
        assertEquals(true, rectangleTest.isRectangle());
    }
}
