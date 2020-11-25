import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        List<Integer> values = new ArrayList<>();
        
        for(int i=1;i<20;i++)
        {
            values.add(i);
        }
        System.out.println(values.stream()
                .filter(i->i%100==0)
                .map(i->i*2)
                .findFirst()
                .orElse(0));

        System.out.println(values.stream().map(i-> i*2).reduce(0,Integer::sum));
//

        //Java 8 call by method feature


    //Deffrent way to iterate arraylist
//        for(int i=0;i<values.size();i++)
//        {
//            System.out.println(i);
//        }
//        Iterator<Integer> itr = values.iterator();
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
//        for(int i:values)
//        {
//            System.out.println(i);
//        }



//        #Earlier code
        //        ArrayList<Integer> list = new ArrayList();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        list.remove(3);
//
//        System.out.println(list.contains(3));
//
//        System.out.println(list.size());
//
//        list.set(2,10);
//
//        for(int i:list)
//        {
//            System.out.println(" "+i);
//        }
//
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
//        System.out.println(list.clone());
//
//        //Sorting array
//
//        List<String> list1 = new ArrayList<String>();
//        list1.add("Mango");
//        list1.add("Apple");
//        list1.add("Banana");
//        list1.add("Grapes");
//
//        Collections.sort(list1);
//
//        for(String i : list1)
//        {
//            System.out.println(i);
//        }
//
//        System.out.println("User defined class objects");
//
//        Student s1 = new Student(1,"Sanju",22);
//        Student s2 = new Student(2,"Anju",23);
//        Student s3 = new Student(4,"Manju",25);
//
//        ArrayList<Student> student  = new ArrayList<Student>();
//        student.add(s1);
//        student.add(s2);
//        student.add(s3);
//
//        Iterator iter = student.iterator();
//
//        while (iter.hasNext())
//        {
//            Student st = (Student)iter.next();
//            System.out.println(st.rollno+" "+st.name+" "+st.age);
//        }
//
//
    }

}
