package final_quizz.punctul2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        List<Double> calculateMultipleSurfacesList = new ArrayList<>();
        List<Double> calculateMultiplePerimetersList = new ArrayList<>();

        CalculateOncePerimeter calculateOncePerimeter = new CalculateOncePerimeter();
        CalculateOnceSurface calculateOnceSurface = new CalculateOnceSurface();

        System.out.println("Do a single calculus, or multiple ones: 1 = single; 2 = multiple");

        int numberOfCalculi = scanner.nextInt();
        if (numberOfCalculi == 1) {

            System.out.println("Please input what do you want to calculate: " +
                    "1 = surface; " +
                    "2 = perimeter");
            int calculusRequired = scanner.nextInt();
            if (calculusRequired == 1) {
                System.out.println("Please input the shape for which you want to make calculus: " +
                        "1 = Rectangle; " +
                        "2 = Square; " +
                        "3 = Circle; " +
                        "4 = Triangle");
                int shapeRequired = scanner.nextInt();
                System.out.println("The result is: "
                        + calculateOnceSurface.calculateShapeSurface(scanner, rectangle, square, circle, triangle, shapeRequired));
            } else if (calculusRequired == 2) {
                System.out.println("Please input the shape for which you want to make calculus: " +
                        "1 = Rectangle; " +
                        "2 = Square; " +
                        "3 = Circle; " +
                        "4 = Triangle");
                int shapeRequired = scanner.nextInt();
                System.out.println("The result is: "
                        + calculateOncePerimeter.calculateShapePerimeter(scanner, rectangle, square, circle, triangle, shapeRequired));
            }
        } else if (numberOfCalculi == 2) {
            System.out.println("Please input what do you want to calculate: " +
                    "1 = surface; " +
                    "2 = perimeter");
            int calculusRequired = scanner.nextInt();
            if (calculusRequired == 1) {
                CalculateMultipleSurfaces
                        .multipleSurfaces(scanner, rectangle, square, circle, triangle, calculateMultipleSurfacesList, calculateOnceSurface);
            } else if (calculusRequired == 2) {
                CalculateMultiplePerimeters
                        .multiplePerimeters(scanner, rectangle, square, circle, triangle, calculateMultiplePerimetersList, calculateOncePerimeter);
            }
        }
    }

}
