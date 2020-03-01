package junit_homework.first_problem;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionSortingToKmTest {
    ExpressionSortingToKm expressionSortingToKm = new ExpressionSortingToKm();
    @Test
    public void testExpressionSortingToKm() {
        double result = expressionSortingToKm.expressionSorting("1m +  1dm");
        Assert.assertEquals(0.0011, result, 0D);
    }
}
