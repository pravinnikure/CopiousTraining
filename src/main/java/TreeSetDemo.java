import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Ball");
        set.add("Bat");
        set.add("Stump");
        System.out.println(set.pollFirst());

        for(String i: set)
        {
            System.out.println(i);
        }

        Iterator<String> itr = set.iterator();

        while (itr.hasNext())
       {
            System.out.println(itr.next());
        }
    }
}
