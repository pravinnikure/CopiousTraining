import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"A");
        map.put(2,"2");
        map.put(3,"C");
        map.put(5,"C");

        map.putIfAbsent(4,"D");

        for(Map.Entry m: map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        Map<Integer,Student> hmap = new HashMap<>();
        Student s1= new Student(1,"Raj",33);
        Student s2 = new Student(3,"Viky",12);
        hmap.put(1,s1);
        hmap.put(2,s2);
        for(Map.Entry<Integer,Student> student: hmap.entrySet())
        {
            int key = student.getKey();
            Student s = student.getValue();


            System.out.println(key+" "+"Student Details:");
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }
    }
}
