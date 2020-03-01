package junit_homework.first_problem;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionSortingToCmTest {
    ExpressionSortingToCm expressionSortingToCm = new ExpressionSortingToCm();
    @Test
    public void testExpressionSortingToCm() {
        double result = expressionSortingToCm.expressionSorting("1km + 1m +  1dm + 1cm + 1mm");
        Assert.assertEquals(100111.1, result, 0D);
    }
}
