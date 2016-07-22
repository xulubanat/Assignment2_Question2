package za.ac.cput.employeemultimod.Impl;

import za.ac.cput.employeemultimod.TaxDeduction;

/**
 * Created by student on 2016/06/03.
 */
public class TaxDeductionImpl implements TaxDeduction {
    private static final double rate = 0.2;
    @Override
    public double deductions(double sal) {
        return sal * 0.2;
    }
}
