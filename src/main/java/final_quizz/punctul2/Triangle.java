package final_quizz.punctul2;

public class Triangle extends Shape {
    private double base;
    private double firstNonBase;
    private double secondNonBase;
    private double height;

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", firstNonBase=" + firstNonBase +
                ", secondNonBase=" + secondNonBase +
                ", height=" + height +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getFirstNonBase() {
        return firstNonBase;
    }

    public void setFirstNonBase(double firstNonBase) {
        this.firstNonBase = firstNonBase;
    }

    public double getSecondNonBase() {
        return secondNonBase;
    }

    public void setSecondNonBase(double secondNonBase) {
        this.secondNonBase = secondNonBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateSurface() throws IllegalArgumentException {
        return (base * height) / 2;
    }

    public double calculateSurface(double base, double height){
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() throws IllegalArgumentException {
        return (base + firstNonBase + secondNonBase);
    }

    public double calculatePerimeter(double base, double firstNonBase, double secondNonBase){
        return (base + firstNonBase + secondNonBase);
    }
}
