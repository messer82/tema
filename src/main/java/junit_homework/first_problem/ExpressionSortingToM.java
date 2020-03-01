package junit_homework.first_problem;

import java.util.ArrayList;
import java.util.List;

public class ExpressionSortingToM {
    public double expressionSorting(String expression) {

        double result = 0;
        ConversionToM conversion = new ConversionToM();
        List<Double> conversionToMList = new ArrayList<>();

        ExpressionCalculus expressionCalculus = new ExpressionCalculus();

        String[] valueOfExpression = expression
                .replaceAll("[-+*/]", "")
                .trim()
                .split("[a-zA-Z]+");
        String[] formatOfExpression = expression
                .replaceAll("[^\\w]+", "")
                .replaceAll("\\d+", " ")
                .trim()
                .split("\\s+");
        String[] operatorOfExpression = expression
                .replaceAll("\\w+", " ")
                .replaceAll("\\.", "")
                .trim()
                .split("\\s+");


        if (valueOfExpression.length != formatOfExpression.length) {
            System.out.println("Something went wrong with the sorting of the expression!");
        } else {
            for (int i = 0; i < valueOfExpression.length; i++) {
                conversionToMList.add(conversion.conversionToM(Double.parseDouble(valueOfExpression[i]), formatOfExpression[i]));
            }
        }
        Object[] convertedValues = conversionToMList.toArray();

        if (convertedValues.length == 1) {
            result = (double) (convertedValues[0]);
            System.out.println(result + " m");
        } else if ((convertedValues.length - 1) != operatorOfExpression.length) {
            System.out.println("Something is wrong at calculus part!");
        } else {
            result = ((double) (convertedValues[0]));
            for (int j = 0; j < convertedValues.length - 1; j++) {
                result = expressionCalculus.expressionCalculus(result, ((double) (convertedValues[j + 1])), operatorOfExpression[j]);

                if (j == convertedValues.length - 2) {
                    System.out.println(result + " m");
                }
            }
        }
        return result;
    }
}
