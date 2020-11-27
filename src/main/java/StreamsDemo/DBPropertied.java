package StreamsDemo;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class DBPropertied
{
    public static void main(String[] args)throws Exception{

        Properties p=new Properties();

        p.setProperty("name","Pravin");
        p.setProperty("email","pravin@gmail.com");

        p.store(new FileWriter("info.properties"),"Properties Example");



    }
}
