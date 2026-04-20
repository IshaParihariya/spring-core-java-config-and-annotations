package service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Spring, create Student object as a bean
@Component
public class Student
{
    private Integer sid = 10;
    private String sname = "Isha";
    private String scity = "Mumbai";
// Student depends on Department object
    private Department depart;


    @Autowired
    public Student(Department depart)
    {
        this.depart = depart;
    }

    @Override
    public String toString()
    {
        return "sid =" + sid +
                " sname = " + sname +
                " scity =" + scity +
                " " + depart;
    }
}