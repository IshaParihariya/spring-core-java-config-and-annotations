package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Employee;

public class LaunchApp
{
    public static void main(String[] args)
    {
        // load spring container
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationconfig.xml");

        // Get bean
        Employee emp = (Employee) context.getBean("emp1");

        // printing toString method
        System.out.println(emp.toString());

        // printing employeeTask method
        System.out.println(emp.employeeTask());

    }
}
