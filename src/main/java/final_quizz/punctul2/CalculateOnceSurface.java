package final_quizz.punctul2;

import java.util.Scanner;

public class CalculateOnceSurface {
    public double calculateShapeSurface(Scanner scanner, Rectangle rectangle, Square square, Circle circle, Triangle triangle, int shapeRequired) {
        double result = 0;
        if (shapeRequired == 1) {
            System.out.println("Please input the width of the rectangle: ");
            double rectangleWidth = scanner.nextDouble();
            System.out.println("Please input the height of the rectangle: ");
            double rectangleHeight = scanner.nextDouble();
            result = rectangle.calculateSurface(rectangleWidth, rectangleHeight);

        } else if (shapeRequired == 2) {
            System.out.println("Please input the length of a side of the square: ");
            double squareLength = scanner.nextDouble();
            result = square.calculateSurface(squareLength);

        } else if (shapeRequired == 3) {
            System.out.println("Please input the radius of the circle: ");
            double radiusLength = scanner.nextDouble();
            result = circle.calculateSurface(radiusLength);

        } else if (shapeRequired == 4) {
            System.out.println("Please input the base of the triangle: ");
            double triangleBase = scanner.nextDouble();
            System.out.println("Please input the height of the triangle: ");
            double triangleHeight = scanner.nextDouble();
            result = triangle.calculateSurface(triangleBase, triangleHeight);
        }
        return result;
    }
}
