package za.ac.cput.employeemultimod;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.employeemultimod.conf.AppConfig;

import java.util.ArrayList;

/**
 * Created by student on 2016/06/03.
 */
public class EmployeeMultiModuleTest {

    private Employee employee;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        employee= (Employee)ctx.getBean("emp");

    }
    @Test
    public void testMonthSal() throws Exception {

        Assert.assertEquals(4000, employee.monthsal(200, 5, 4 ), 0.02);

    }

    @Test
    public void testCommission() throws Exception {

        Assert.assertEquals(0, employee.commission(200), 0.01);

    }

    @Test
    public void testTax() throws Exception {

        Assert.assertEquals(20000, employee.deductions(100000), 0.02);

    }

    @Test
    public void testProjects() throws Exception {

        ArrayList<String> projects = new ArrayList<String>();
        projects.add("Multichoice");
        projects.add("woolworths");
        Assert.assertEquals(2, employee.projects(projects));
    }
}
