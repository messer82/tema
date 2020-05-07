package final_quizz.punctul2;

public class Rectangle extends Shape {
    private double length;
    private double width;
    private double height;

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateSurface() throws IllegalArgumentException {
        return (this.width * this.height);
    }

    public double calculateSurface(double width, double height) {
        return (width * height);
    }

    @Override
    public double calculatePerimeter() throws IllegalArgumentException {
        return ((length * 2) + (width * 2));
    }

    public double calculatePerimeter(double width, double length){
        return ((length * 2) + (width * 2));
    }
}
