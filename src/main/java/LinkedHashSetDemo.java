import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");
        set.add("C");        set.add("B");
        set.add("C");
        
        Iterator<String> itr = set.iterator();
//Ignoring duplicates
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        LinkedHashSet<Student> hash = new LinkedHashSet<Student>();
        Student s1 = new Student(1,"Raj",34);
        Student s2 = new Student(2,"Biku",44);

        hash.add(s1);
        hash.add(s2);

        for(Student s: hash)
        {
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }


    }
}

