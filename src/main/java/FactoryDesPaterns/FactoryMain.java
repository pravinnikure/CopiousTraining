package FactoryDesPaterns;

public class FactoryMain
{
    public static void main(String[] args)
    {
        EmpOperatingFactory eof = new EmpOperatingFactory();
        EmployeSpec spe = eof.getInstance("Close");
        spe.specification();
    }
}
