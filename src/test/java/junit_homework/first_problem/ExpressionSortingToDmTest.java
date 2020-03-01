package junit_homework.first_problem;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionSortingToDmTest {
    ExpressionSortingToDm expressionSortingToDm = new ExpressionSortingToDm();
    @Test
    public void testExpressionSortingToDm() {
        double result = expressionSortingToDm.expressionSorting("1km");
        Assert.assertEquals(10000.0, result, 0D);
    }
}
