package za.ac.cput.employeemultimod.conf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.employeemultimod.Employee;
import za.ac.cput.employeemultimod.Impl.ModularEmployeeImpl;

/**
 * Created by student on 2016/06/03.
 */
@Configuration
public class AppConfig {

    @Bean(name = "emp")
    public Employee getEmployee() {
        return new ModularEmployeeImpl();
    }
}

