package service;

public class Student
{
    private Integer sid;
    private String sname;
    private String scity;
    // object of Department
    private Department depart;

    // constructor with no para
    // NOTE : necessary to have zero param constructor when using p:
    // Default constructor is required for setter injection because Spring first creates
    // the bean using no-arg constructor and then injects values using setters.
    public Student()
    {
        super();
    }
    // constructor with para
    public Student(Integer sid,String sname, String scity,Department depart)
    {
        super();
        this.sid=sid;
        this.sname=sname;
        this.scity=scity;

        this.depart=depart;
    }
    // setters and getters as well so we can use c: and p: both
    public void setSid(Integer sid)
    {
        this.sid=sid;
    }
    public void setSname(String sname)
    {
        this.sname=sname;
    }
    public void setScity(String scity)
    {
        this.scity=scity;
    }
    public void setDepart(Department depart)
    {
        this.depart = depart;
    }

    // getters
    public Integer getSid()
    {
        return sid;
    }
    public String getSname()
    {
        return sname;
    }
    public String getScity()
    {
        return scity;
    }
    public Department getDepart()
    {
        return depart;
    }


    // to string method overridden

    @Override
    public String toString()
    {
        return "sid ="+sid+ " sname = "+sname+" scity ="+scity+" "+depart;
    }
}
