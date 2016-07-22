package za.ac.cput.employeemultimod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.employeemultimod.Impl.CommissionImpl;

/**
 * Created by student on 2016/06/03.
 */
public class CommissionTest {

    private Commission comm;
    @Before
    public void setUp() throws Exception {
        comm = new CommissionImpl();

    }
    @Test
    public void testCommission() throws Exception {
        Assert.assertEquals(0, comm.commission(200), 0.01);

    }
}
