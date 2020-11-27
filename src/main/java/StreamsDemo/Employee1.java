package StreamsDemo;

public class Employee1
{
    int empId;
    String name;
    double salary;
    public Employee1(int empId,String name,double salary)
    {
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
