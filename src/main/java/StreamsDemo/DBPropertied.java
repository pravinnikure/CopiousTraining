package StreamsDemo;
import java.io.FileReader;
import java.util.Properties;

public class DBPropertied
{
    public static void main(String[] args) throws Exception {
        FileReader reader =new FileReader("db.properties");

        Properties prop = new Properties();
        prop.load(reader);
        System.out.println(prop.getProperty("user"));
        System.out.println(prop.getProperty("password"));
    }
}
