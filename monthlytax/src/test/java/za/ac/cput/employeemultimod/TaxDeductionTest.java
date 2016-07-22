package za.ac.cput.employeemultimod;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.employeemultimod.Impl.TaxDeductionImpl;

/**
 * Created by student on 2016/06/03.
 */
public class TaxDeductionTest {
    private TaxDeduction tax;

    @Before
    public void setUpd() throws Exception{
        tax = new TaxDeductionImpl();

    }

    @Test
    public void testTaxDeduction() throws Exception{

        Assert.assertEquals(20000, tax.deductions(100000), 0.02);
    }
}
