package StreamsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStream
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            list.add(i);
        }
        list.add(1);
        list.add(2);
        System.out.println(list);
        Set cn= list.stream().map(i->i++).collect(Collectors.toSet());
        System.out.println(cn);

        List<Employee> list1 = new ArrayList<>();
        Employee e1 = new Employee(01,"Robert",5000.0);
        Employee e2 = new Employee(02,"Alen",7000.0);
        Employee e3 = new Employee(03,"Deepak",15000.0);
        Employee e4 = new Employee(04,"Vinod",3000.0);
        //Employee added
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        list1.add(e4);

        Set<Double> set = list1.stream()
                .filter(p->p.salary>3000)
                .map(p->p.salary).collect(Collectors.toSet());
        System.out.println(set);



    }
}
