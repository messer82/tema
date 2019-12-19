package OOP_homework.Punctul2;

import org.junit.Assert;
import org.junit.Test;

public class AdderSum100Test {
    AdderSum100 adderSum100 = new AdderSum100();
    @Test
    public void testAdderSum100() {
        int sum = adderSum100.makeSum(100);
        Assert.assertEquals(5050, sum);

    }
}
