package Exceptions;

import StreamsDemo.Employee1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2
{
    int empId;
    String name;
    double salary;
    int age;
    public Employee2(int empId,String name,double salary,int age)
    {
        this.empId=empId;
        this.name=name;
        this.salary=salary;
        this.age=age;
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
    public int getAge() {
        return age;
    }
    static void validateScore(int age) throws InvalidAgeException
    {
        if(age <18 && age>50)
        {
            throw new InvalidAgeException("Age Invalid...");
        }
    }
}
public class TestAgeException
{

    public static void main(String[] args)
    {

        List<Employee2> emp1 = new ArrayList<>();

        Employee2 e1 = new Employee2(1,"Sham",4000,17);
        Employee2 e2 = new Employee2(4,"Ram",8000,18);
        Employee2 e3 = new Employee2(6,"Sima",9000,22);
        Employee2 e5 = new Employee2(8,"Amit",4000,19);
        Employee2 e6 = new Employee2(2,null,4000,16);
        emp1.add(e3);
        emp1.add(e5);
        emp1.add(e6);
        emp1.add(e1);
        emp1.add(e2);






//            emp1.stream().forEach(p-> {
//                try {
//                    Employee2.validateScore(p.getAge());
//                } catch (InvalidAgeException e) {
//                    e.printStackTrace();
//                }
//            });






    }
}
