package junit_homework.first_problem;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionSortingGeneralTest {
    ExpressionSortingToMm expressionSortingToMm = new ExpressionSortingToMm();
    ExpressionSortingToCm expressionSortingToCm = new ExpressionSortingToCm();
    ExpressionSortingToDm expressionSortingToDm = new ExpressionSortingToDm();
    ExpressionSortingToM expressionSortingToM = new ExpressionSortingToM();
    ExpressionSortingToKm expressionSortingToKm = new ExpressionSortingToKm();
    @Test
    public void testExpressionSortingGeneral() {
        double result = expressionSortingToMm.expressionSorting("15 cm + 1.1 m - 10 mm");
        double result1 = expressionSortingToCm.expressionSorting("15 cm + 1.1 m - 10 mm");
        double result2 = expressionSortingToDm.expressionSorting("15 cm + 1.1 m - 10 mm");
        double result3 = expressionSortingToM.expressionSorting("15 cm + 1.1 m - 10 mm");
        double result4 = expressionSortingToKm.expressionSorting("15 cm + 1.1 m - 10 mm");
        Assert.assertTrue(1240.0 == result);
    }
}
