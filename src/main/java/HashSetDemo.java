import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Papaya");
        set.add("Grapes");

        set.remove("Mango");
        Iterator<String> itr =set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //Hashset from another collections
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add(2);
        list.add(3);
        HashSet<Integer> has = new HashSet(list);
        has.add(12);
        Iterator<Integer> itre = has.iterator();
        while (itre.hasNext()) {
            System.out.println(itre.next());
        }

        //HashSet from UserrDefined class
        HashSet<Student> hash = new HashSet<Student>();
        Student s1 = new Student(2,"Avi",44);
        Student s2 = new Student(1,"Ravi",41);
        Student s3 = new Student(4,"Sham",43);

        hash.add(s1);
        hash.add(s2);
        hash.add(s3);

        for(Student s : hash){

            System.out.println(s.rollno+" "+s.name+" "+s.age);

        }

    }
}
