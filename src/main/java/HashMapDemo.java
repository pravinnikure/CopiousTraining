import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"A");
        map.put(2,"2");
        map.put(3,"C");
        map.put(4,"C");


        for(Map.Entry m: map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
