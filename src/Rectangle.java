public class Rectangle {
  private double width;
  private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length * width;
    }
    public double getDiagonal(){
        double a = length * length;
        double b = width* width;
        double c = Math.sqrt(a + b);

        return c;
    }

    public boolean isSquare(){

        if(length == width) {
            return true;

        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + this.getArea() +
                ", is  Square=" +this.isSquare() +
                '}';
    }
}
