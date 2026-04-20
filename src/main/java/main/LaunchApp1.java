package main;
// for service p: and c: learning
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Student;

public class LaunchApp1
{
    public static void main(String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationconfig1.xml");

        // bean 1
        Student student=(Student)context.getBean("student1");

        System.out.println(student.toString());

        // bean 2
        Student student1=(Student)context.getBean("student2");

        System.out.println(student1.toString());
    }
}
