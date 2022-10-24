public class Circle extends Shape{
    Integer radius;
    double pi = 3.14, perimeter, area, circumference;
    public Circle(int radius){
        this.radius = radius;
        this.circumference = getCircumference();
        this.area = getArea();
    }

    public double getArea(){
        area = pi * radius * radius;
        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }

    public int getRadius(){
        return radius;
    }
    public double getCircumference(){
        circumference = radius*2 * pi;
        return circumference;
    }
    public boolean isCircle(){
        if(radius != null){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void becomeString(){
        System.out.println("A Circle with radius=" + radius + ", which is a which is a subclass of ");
        super.becomeString();
    }

}
