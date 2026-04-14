package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Employee;

public class LaunchApp
{
    public static void main(String[] args)
    {
        // object 1
        // load spring container
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationconfig.xml");

        // Get bean
        Employee emp1 = (Employee) context.getBean("emp1");

        // printing toString method
        System.out.println(emp1.toString());

        // printing employeeTask method
        System.out.println(emp1.employeeTask());


        // object 2
       Employee emp2=(Employee)context.getBean("emp2");

        // printing toString method
        System.out.println(emp2.toString());

        // printing employeeTask method
        System.out.println(emp2.employeeTask());


        // object 3
        Employee emp3=(Employee)context.getBean("emp3");

        // printing toString method
        System.out.println(emp3.toString());

        // printing employeeTask method
        System.out.println(emp3.employeeTask());
    }
}
