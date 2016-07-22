package za.ac.cput.employeemultimod;

import java.util.ArrayList;

/**
 * Created by student on 2016/06/03.
 */
public interface Employee {
    double monthsal(double rate, double hours, int weeks); //daily
    double deductions(double sal);
    double commission(double salesAmt);
    int projects( ArrayList<String> projects);

}
