package StreamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp1Stream
{
    public static void main(String[] args)
    {
        List<Employee1> emp1 = new ArrayList<>();
        Employee1 e1 = new Employee1(1,"Sham",4000);
        Employee1 e2 = new Employee1(4,"Ram",8000);
        Employee1 e3 = new Employee1(6,"Sima",9000);

        emp1.add(e1);
        emp1.add(e2);
        emp1.add(e3);

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
