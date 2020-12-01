package FactoryDesPaterns;

public class EmpOperatingFactory
{
    public EmployeSpec getInstance(String str)
    {
        if(str.equals("Phone"))
            return new EmpWithPhon();
        else if(str.equals("iPhone"))
            return new EmpWithIPhone();
        else
            return new EmpWithLaptop();
    }
}
