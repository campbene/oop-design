public abstract class Shape {
    protected String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }

    public boolean isFILLED() {
        return filled;
    }

    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public void becomeString(){
        if (filled) {
            System.out.println("A Shape with color of " + color + " and is filled.");
        } else {
            System.out.println("A Shape with color of " + color + " and is not filled");
        }
    }
}
