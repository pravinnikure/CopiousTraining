import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

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
        System.out.println(list);



    }
}
