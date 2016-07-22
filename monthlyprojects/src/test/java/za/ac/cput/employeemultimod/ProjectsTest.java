package za.ac.cput.employeemultimod;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.employeemultimod.Impl.ProjectsImpl;

import java.util.ArrayList;

/**
 * Created by student on 2016/06/03.
 */
public class ProjectsTest {

    private Projects project;

    @Before
    public void setUpd() throws Exception{
        project = new ProjectsImpl();

    }

    @Test
    public void testTaxDeduction() throws Exception{
        ArrayList<String> projects = new ArrayList<String>();
        projects.add("Multichoice");
        projects.add("woolworths");
        projects.add("ETV");
        Assert.assertEquals(3, project.projects(projects));
    }
}
