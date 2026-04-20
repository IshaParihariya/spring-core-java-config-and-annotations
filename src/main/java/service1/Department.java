package service1;

import org.springframework.stereotype.Component;

// Spring, please create an object (bean) of this class automatically=> omponent annotation
@Component
public class Department
{
    private Integer d_id = 201;
    private String dname = "AI";

    @Override
    public String toString()
    {
        return "d_id =" + d_id + " dname = " + dname;
    }
}