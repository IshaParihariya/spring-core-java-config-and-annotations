package service;

public class Boss
{
    private Integer empId;
    private String name;
    private String city;

    public Boss(Integer empId, String name, String city)
    {
        super();
        System.out.println("Employee Bean created");
        this.empId=empId;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString()
    {
        return "Employee = [ empId =" + empId+ " name = "+name +" city = "+city+ " ]";
    }


}
