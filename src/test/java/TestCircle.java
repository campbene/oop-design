import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCircle {
    double pi = 3.14;
    Integer radius = 4;
    Circle circleTest = new Circle(radius);

    @Test
    public void testCircleArea(){
        double areaCheck = 3.14 * radius * radius;
        assertEquals(areaCheck, circleTest.getArea());
    }
    @Test
    public void testCircleCircumference(){
        double circumferenceCheck = 3.14 * 2 * radius;
        assertEquals(circumferenceCheck, circleTest.getCircumference());
    }
    @Test
    public void testCircleGetRadius(){
        int checkRadius = radius;
        assertEquals(checkRadius, circleTest.getRadius());
    }
    @Test
    public void testIsCircle(){
        assertEquals(true, circleTest.isCircle());
    }
}
