package za.ac.cput.employeemultimod.Impl;

import za.ac.cput.employeemultimod.MonthSal;

/**
 * Created by student on 2016/06/03.
 */
public class MonthSalImpl implements MonthSal {

    @Override
    public double monthsal(double rate, double hours, int weeks) {
        return (rate * hours) * weeks;
    }
}
