package FactoryDesPaterns;

public class EmpWithIPhone implements EmployeSpec
{

    @Override
    public void specification() {
        System.out.println("Major employee...");
    }
}
