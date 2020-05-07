package final_quizz.punctul2;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CalculateMultipleSurfaces {
    static void multipleSurfaces(Scanner scanner, Rectangle rectangle, Square square, Circle circle, Triangle triangle, List<Double> calculateMultipleSurfacesList, CalculateOnceSurface calculateOnceSurface) {
        Set<Integer> surfaceShapeDuplicate = new HashSet<>();
        int showResult = 1;
        int shapeRequired = 0;
            while (showResult != 2) {
                System.out.println("Please input the shape for which you want to make calculus: " +
                        "1 = Rectangle; " +
                        "2 = Square; " +
                        "3 = Circle; " +
                        "4 = Triangle");
                shapeRequired = scanner.nextInt();

                boolean nonDuplicate = surfaceShapeDuplicate.add(shapeRequired);

                if (!nonDuplicate) {
                    System.out.println("You have selected the same shape twice!");
                    System.exit(0);
                }

                calculateMultipleSurfacesList
                        .add(calculateOnceSurface.calculateShapeSurface(scanner, rectangle, square, circle, triangle, shapeRequired));

                System.out.println("Please advise if you want to add more shapes: 1 = continue; 2 = result");
                showResult = scanner.nextInt();
            }
                if (showResult == 2) {
            double sum = 0;
            for (Double d : calculateMultipleSurfacesList) {
                sum = sum + d;
            }
            System.out.println("The total surface is: " + sum);
        }
    }
}