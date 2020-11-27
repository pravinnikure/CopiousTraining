package StreamsDemo;

import java.util.*;
import java.util.stream.Collectors;

public class Emp1Stream
{
    public static void main(String[] args)
    {
        List<Employee1> emp1 = new ArrayList<>();

        Employee1 e1 = new Employee1(1,"Sham",4000);
        Employee1 e2 = new Employee1(4,"Ram",8000);
        Employee1 e3 = new Employee1(6,"Sima",9000);
        Employee1 e5 = new Employee1(8,"Amit",4000);
        Employee1 e6 = new Employee1(2,"Abhi",4000);
        emp1.add(e3);
        emp1.add(e5);
        emp1.add(e6);

        emp1.add(e1);
        emp1.add(e2);


        Comparator<Employee1> cmp1 = Comparator.comparing(Employee1::getName);
        Collections.sort(emp1,cmp1);

        Comparator<Employee1> cmp2 = Comparator.comparing(Employee1::getEmpId);
        Collections.sort(emp1,cmp2);

        System.out.println("Sorting by name:");
        for(Employee1 emp : emp1)
        {
            System.out.println(emp.empId+" "+emp.name+" "+emp.salary);
        }
        System.out.println("Sorting by Employee Id:");
        for(Employee1 emp : emp1)
        {
            System.out.println(emp.empId+" "+emp.name+" "+emp.salary);
        }

        //Use of method reference
        List<String> list = emp1.stream().filter(e->e.salary>5000)
                .map(Employee1::getName)
                .collect(Collectors.toList());
        System.out.println(list);

        //COnversion of list to map using method reference
        Map<Integer,String> map = emp1.stream().filter(e->e.salary>5000)
                .collect(Collectors.toMap(Employee1::getEmpId,Employee1::getName));
        System.out.println(map);
        


    }
}
