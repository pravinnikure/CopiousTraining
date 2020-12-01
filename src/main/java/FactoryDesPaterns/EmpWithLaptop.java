package FactoryDesPaterns;

public class EmpWithLaptop implements EmployeSpec
{
    @Override
    public void specification()
    {
        System.out.println("Employee will do WFH...");
    }
}
