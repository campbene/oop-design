public class Square extends Rectangle {
    public Square(int sideLength) {
        super(sideLength);
    }
    public boolean isSquare(){
        if(width == height){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void becomeString(){
        System.out.println("A Square with side=" + width + ", which is a subclass of ");
        super.becomeString();
    }
}
