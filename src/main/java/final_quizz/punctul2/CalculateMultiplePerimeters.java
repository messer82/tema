package final_quizz.punctul2;

import java.util.*;

public class CalculateMultiplePerimeters {
    static void multiplePerimeters(Scanner scanner, Rectangle rectangle, Square square, Circle circle, Triangle triangle, List<Double> calculateMultiplePerimetersList, CalculateOncePerimeter calculateOncePerimeter) {
        Set<Integer> perimetersShapeDuplicate = new HashSet<>();
        int showResult = 1;
        int shapeRequired = 0;
        while (showResult != 2) {
            System.out.println("Please input the shape for which you want to make calculus: " +
                    "1 = Rectangle; " +
                    "2 = Square; " +
                    "3 = Circle; " +
                    "4 = Triangle");
            shapeRequired = scanner.nextInt();

             boolean nonDuplicate = perimetersShapeDuplicate.add(shapeRequired);

             if (!nonDuplicate) {
                 System.out.println("You have selected the same shape twice!");
                 System.exit(0);
             }

            calculateMultiplePerimetersList
                    .add(calculateOncePerimeter.calculateShapePerimeter(scanner, rectangle, square, circle, triangle, shapeRequired));

            System.out.println("Please advise if you want to add more shapes: 1 = continue; 2 = result");
            showResult = scanner.nextInt();

            if (showResult == 2) {
                double sum = 0;
                for (Double d : calculateMultiplePerimetersList) {
                    sum = sum + d;
                }
                System.out.println("The total perimeter is: " + sum);
            }
        }
    }
}