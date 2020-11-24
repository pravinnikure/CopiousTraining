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
        Iterator<String> itr =set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
