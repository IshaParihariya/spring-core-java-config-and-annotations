package service;

public class Department
{
    private Integer d_id;
    private String dname;



    // only constructor so we will use only c: and not p:
    // constructor
    public Department(Integer d_id,String dname)
    {
        super();
        this.d_id=d_id;
        this.dname=dname;

    }

    // to string method overridden
    @Override
    public String toString()
    {
        return "d_id ="+d_id+ " dname = "+dname;
    }
}
