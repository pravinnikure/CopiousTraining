package Exceptions;

import StreamsDemo.Employee;
import StreamsDemo.Employee1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AgeException
{
    public static void main(String[] args)
    {
            List<Employe> employee1 = new ArrayList<>();

            Employe e1 = new Employe(1, "Raj", 5000, 21);

            Employe e2 = new Employe(2, "Ram", 6000, 17);
            Employe e3 = new Employe(3, "Sita", 8000, 22);
            Employe e5 = new Employe(8, "Amit", 4000, 53);
            Employe e6 = new Employe(2, null, 4000, 30);

            employee1.add(e3);
            employee1.add(e5);
            employee1.add(e6);
            employee1.add(e1);
            employee1.add(e2);

        try {
            for (Employe emp : employee1) {
                if (emp.age < 18 || emp.age > 52)
                {
                    throw new EmpException("Invalid age...");
                }
                else {
                    System.out.println(emp.getName());
                }
            }
        }
        catch (EmpException e)
        {
            System.out.println(e);
        }
    }

//
//        try
//        {
//           //employee1.stream().filter(p->p.age>18 || p.age<52).iterator();
//
//           employee1.stream().forEach();
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }



}


