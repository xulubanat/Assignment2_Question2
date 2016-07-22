package za.ac.cput.employeemultimod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.employeemultimod.Impl.MonthSalImpl;

/**
 * Created by student on 2016/06/03.
 */
public class TestMonthSal {
    private MonthSal sal;
    @Before
    public void setUp() throws Exception {
        sal = new MonthSalImpl();

    }
    @Test
    public void testMonthSal() throws Exception {
        Assert.assertEquals(4000, sal.monthsal(200, 5, 4 ), 0.02);

    }
}
