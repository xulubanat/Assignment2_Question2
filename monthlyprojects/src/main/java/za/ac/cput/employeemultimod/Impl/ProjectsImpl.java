package za.ac.cput.employeemultimod.Impl;

import za.ac.cput.employeemultimod.Projects;


import java.util.ArrayList;
import java.util.Map;

/**
 * Created by student on 2016/06/03.
 */
public class ProjectsImpl implements Projects {

    @Override
    public int projects(ArrayList<String> projects) {

        return projects.size();
    }

}
