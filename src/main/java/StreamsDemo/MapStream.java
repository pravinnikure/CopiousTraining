package StreamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapStream
{
    public static void main(String[] args)
    {
        List<Employee> list1 = new ArrayList<>();
        Employee e1 = new Employee(01,"Robert",5000.0);
        Employee e2 = new Employee(02,"Alen",7000.0);
        Employee e3 = new Employee(03,"Deepak",15000.0);
        Employee e4 = new Employee(04,"Vinod",3000.0);
        //Employee added
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);

        Map<Integer,String> map = list1.stream().filter(p->p.name.length()>4)
                .collect(Collectors.toMap(p->p.empId,p->p.name));
        System.out.println(map);

    }
}
