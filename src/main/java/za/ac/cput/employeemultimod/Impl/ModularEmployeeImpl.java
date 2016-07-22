package za.ac.cput.employeemultimod.Impl;

import za.ac.cput.employeemultimod.*;


import java.util.ArrayList;

/**
 * Created by student on 2016/06/03.
 */
public class ModularEmployeeImpl implements Employee {

    private MonthSal module_monthsal = new MonthSalImpl();

    TaxDeduction module_taxdeduction = new TaxDeductionImpl();

    Commission module_comm = new CommissionImpl();

    Projects module_projects = new ProjectsImpl();

    @Override
    public double monthsal(double rate, double hours, int weeks) {
        return module_monthsal.monthsal(rate, hours, weeks);
    }

    @Override
    public double deductions(double sal) {
        return module_taxdeduction.deductions(sal);
    }

    @Override
    public double commission(double salesAmt) {
        return module_comm.commission(salesAmt);
    }

    @Override
    public int projects(ArrayList<String> projects) {
        return module_projects.projects(projects);
    }
}
