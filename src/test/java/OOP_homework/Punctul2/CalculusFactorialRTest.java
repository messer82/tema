package OOP_homework.Punctul2;

import org.junit.Assert;
import org.junit.Test;

public class CalculusFactorialRTest {
    CalculusFactorialR calculusFactorialR = new CalculusFactorialR();
    @Test
    public void testCalculusFactorialR() {
        int prod = calculusFactorialR.factorialNumber(5);
        Assert.assertEquals(120, prod);
    }

}
