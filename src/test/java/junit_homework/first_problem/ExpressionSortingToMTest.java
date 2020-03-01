package junit_homework.first_problem;

import org.junit.Assert;
import org.junit.Test;

public class ExpressionSortingToMTest {
    ExpressionSortingToM expressionSortingToM = new ExpressionSortingToM();
    @Test
    public void testExpressionSortingToM() {
        double result = expressionSortingToM.expressionSorting("1km + 1m +  1dm + 1cm + 1mm");
        Assert.assertEquals(1001.111, result, 0D);
    }
}
