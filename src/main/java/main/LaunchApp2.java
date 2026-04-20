package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service1.Student;

// Note:
/*
@Component → create bean
@Autowired → inject dependency
@Configuration → config class annotation
@ComponentScan → find beans
 */
// for service1
public class LaunchApp2
{
    public static void main(String[] args)
    {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        System.out.println(student);
    }

}
