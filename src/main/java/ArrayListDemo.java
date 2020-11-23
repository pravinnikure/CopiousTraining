import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.*;

public class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(3);

        System.out.println(list.contains(3));

        System.out.println(list.size());

        list.set(2,10);

        for(int i:list)
        {
            System.out.println(" "+i);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println(list.clone());

        //Sorting array

        List<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");

        Collections.sort(list1);

        for(String i : list1)
        {
            System.out.println(i);
        }

        System.out.println("User defined class objects");

        Student s1 = new Student(1,"Sanju",22);
        Student s2 = new Student(2,"Anju",23);
        Student s3 = new Student(4,"Manju",25);

        ArrayList<Student> student  = new ArrayList<Student>();
        student.add(s1);
        student.add(s2);
        student.add(s3);

        Iterator iter = student.iterator();

        while (iter.hasNext())
        {
            Student st = (Student)iter.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


    }

}
