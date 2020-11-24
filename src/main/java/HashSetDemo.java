import java.util.ArrayList;
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


    }
}
