package final_quizz.punctul2;

public class Square extends Shape {

    private double lengthOfSide;

    @Override
    public String toString() {
        return "Square{" +
                "lengthOfSide=" + lengthOfSide +
                '}';
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double calculateSurface() throws IllegalArgumentException {
        return (Math.pow(this.lengthOfSide, 2));
    }

    public double calculateSurface(double lengthOfSide){
        return (Math.pow(lengthOfSide, 2));
    }

    @Override
    public double calculatePerimeter() throws IllegalArgumentException {
        return (lengthOfSide * 4);
    }

    public double calculatePerimeter(double lengthOfSide){
        return (lengthOfSide * 4);
    }
}
