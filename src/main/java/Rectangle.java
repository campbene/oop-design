import static java.lang.Math.sqrt;

public class Rectangle extends Shape{
    int width, height;
    double area, perimeter, diagonal;
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle (int width, int height){
        this.width = width;
        this.height = height;
        this.area = getArea();
        this.perimeter = getPerimeter();
        this.diagonal = getDiagonal();
    }
    public Rectangle (int sideLength){
        this.width = sideLength;
        this.height = sideLength;
        this.area = getArea();
        this.perimeter = getPerimeter();
        this.diagonal = getDiagonal();
    }

    public double getArea(){
        area = width * height;
        return area;
    }
    public double getPerimeter(){
        perimeter = (width*2) + (height*2);
        return perimeter;
    }
    public double getDiagonal(){
        diagonal = sqrt((width * width)+(height * height));
        return diagonal;
    }
    public boolean isRectangle(){
        if(width != height){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public void becomeString(){
        System.out.println("A Rectangle with width=" + width + " and length=" + height +
                ", which is a subclass of ");
        super.becomeString();
    }
}
