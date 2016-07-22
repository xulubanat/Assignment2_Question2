package za.ac.cput.employeemultimod.Impl;

import za.ac.cput.employeemultimod.Commission;

/**
 * Created by student on 2016/06/03.
 */
public class CommissionImpl implements Commission {
    private static final double rate1 = 0.5;
    private static final double rate2 = 0.14;

    @Override
    public double commission(double salesAmt) {
        if(salesAmt > 200000) {

            return salesAmt * rate1;

        }
        else if(salesAmt >20000){
            return salesAmt * rate2;
        }
        else {

            return 0;
        }
    }
}
