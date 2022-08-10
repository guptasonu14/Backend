package test;

import main.Calc;
import org.junit.Assert;
import org.junit.Test;

public class TestCalc {

    @Test
    public void testSum() {
        Assert.assertEquals(7, Calc.sumOfTwoNum(3, 4));

    }
     @Test
    public void testSub() {
        Assert.assertEquals(4, Calc.sub(8, 4));

    }
}
