package Exceptions;

public class Employe
{
    int age;
    int empId;
    String name;
    double salary;


    public int getAge() {
        return age;
    }

    public Employe(int empId, String name, double salary, int age)
    {
        this.empId=empId;
        this.name=name;
        this.salary=salary;
        this.age = age;
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
