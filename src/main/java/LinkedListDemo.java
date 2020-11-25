import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1,"Z");

        Iterator<String> itr = list.iterator();
        Collections.sort(list);

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        list.add(1,"Z");
        list.remove("Z");

        System.out.println(list);


        //User defined class example
        List<Student> st =new LinkedList<Student>();

        Student s1 = new Student(1,"Raj",22);
        Student s3 = new Student(3,"Abhi",23);
        Student s2 = new Student(2,"Ani",24);

        st.add(s1);
        st.add(s2);
        st.add(s3);
        for(Student s: st){
            System.out.println(s.rollno+" "+s.name+" "+s.rollno);
        }
    }
}
