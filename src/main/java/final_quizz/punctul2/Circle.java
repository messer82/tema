package final_quizz.punctul2;

public class Circle extends Shape {
    private double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurface() throws IllegalArgumentException {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double calculateSurface(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() throws IllegalArgumentException {
        return (2 * Math.PI * radius);
    }

    public double calculatePerimeter(double radius){
        return (2 * Math.PI * radius);
    }
}
