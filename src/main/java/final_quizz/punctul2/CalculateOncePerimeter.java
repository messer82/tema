package final_quizz.punctul2;

import java.util.Scanner;

public class CalculateOncePerimeter {
    public double calculateShapePerimeter(Scanner scanner, Rectangle rectangle, Square square, Circle circle, Triangle triangle, int shapeRequired) {
        double result = 0;
            if (shapeRequired == 1) {
                System.out.println("Please input the width of the rectangle: ");
                double rectangleWidth = scanner.nextDouble();
                System.out.println("Please input the length of the rectangle: ");
                double rectangleLength = scanner.nextDouble();
                result = rectangle.calculatePerimeter(rectangleWidth, rectangleLength);

            } else if (shapeRequired == 2) {
                System.out.println("Please input the length of a side of the square: ");
                double squareLength = scanner.nextDouble();
                result = square.calculatePerimeter(squareLength);

            } else if (shapeRequired == 3) {
                System.out.println("Please input the radius of the circle: ");
                double radiusLength = scanner.nextDouble();
                result = circle.calculatePerimeter(radiusLength);

            } else if (shapeRequired == 4) {
                System.out.println("Please input the base of the triangle: ");
                double triangleBase = scanner.nextDouble();
                System.out.println("Please input the first non base of the triangle: ");
                double triangleFirstNonBase = scanner.nextDouble();
                System.out.println("Please input the second non base of the triangle: ");
                double triangleSecondNonBase = scanner.nextDouble();
                result = triangle.calculatePerimeter(triangleBase, triangleFirstNonBase, triangleSecondNonBase);
            }
            return result;
    }
}