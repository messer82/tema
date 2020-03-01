package junit_homework.first_problem;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionSortingToMmTest {
    ExpressionSortingToMm expressionSortingToMm = new ExpressionSortingToMm();
    @Test
    public void testExpressionSortingToMm() {
        double result = expressionSortingToMm.expressionSorting("15 cm + 1.1 m - 10 mm");
        Assert.assertEquals(1240.0, result, 0D);
    }
}
