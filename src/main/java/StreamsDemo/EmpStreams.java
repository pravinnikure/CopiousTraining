package StreamsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpStreams
{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        //4 Employee created
        Employee e1 = new Employee(01,"Robert",5000.0);
        Employee e2 = new Employee(02,"Alen",7000.0);
        Employee e3 = new Employee(03,"Deepak",15000.0);
        Employee e4 = new Employee(04,"Vinod",3000.0);
        //Employee added
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        //Iteration using for each loop
        for(Employee i :list)
        {
            System.out.println(i.empId+" "+i.name+" "+i.salary);
        }
        //Iterating using streams
        //Printing employee whose salary is greater than 50000
        System.out.println("Id"+" "+"Name");
        list.stream()
                .filter(employe -> employe.salary>5000)
                .forEach(employee->System.out.println(employee.empId+" "+employee.name+" "));

        Double totalSal = list.stream().map(j->j.salary).reduce(0.0,Double::sum);
        System.out.println("Total salay to pay:"+totalSal);
//        List<Double> employees = list.stream()
//                                   .filter(i ->i.salary>5000)
//                                    .map(p->p.salary).collect(Collectors.toList());
//        System.out.println(employees);

        //Summing using Collectors
        double total2 = list.stream().
                collect(Collectors.summingDouble(e->e.salary));
        System.out.println(total2);

    }
}
