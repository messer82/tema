package junit_homework.first_problem;

//Write a calculator that is capable of computing a metric distance value from an expression that contains different scales and systems.
//
//        Output should be specified by the user.
//
//        Only Addition and subtraction is allowed.
//
//        Implement the calculator and write unit tests that prove that the computations are correct.
//
//        Supported formats: mm, cm, dm, m, km

public class JUnitProblemOne {
    public static void main(String[] args) {
        String expression = "15 cm + 1.1 m - 10 mm";

        ExpressionSortingToMm expressionSortingToMm = new ExpressionSortingToMm();
        expressionSortingToMm.expressionSorting(expression);

        ExpressionSortingToCm expressionSortingToCm = new ExpressionSortingToCm();
        expressionSortingToCm.expressionSorting(expression);

        ExpressionSortingToDm expressionSortingToDm = new ExpressionSortingToDm();
        expressionSortingToDm.expressionSorting(expression);

        ExpressionSortingToM expressionSortingToM = new ExpressionSortingToM();
        expressionSortingToM.expressionSorting(expression);

        ExpressionSortingToKm expressionSortingToKm = new ExpressionSortingToKm();
        expressionSortingToKm.expressionSorting(expression);

    }

}
