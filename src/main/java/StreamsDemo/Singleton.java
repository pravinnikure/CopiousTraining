package StreamsDemo;

import java.sql.SQLOutput;

public class Singleton
{
    public static void main(String[] args) {
        Demo obj = Demo.getInstance();

    }
}
class Demo
{
    //Streps to create an singleton patterns

    static Demo obj = new Demo();
    //Only one object is create foe singleton  //private Demo
    private Demo()
    {

    }
    //for returning instance
    public static Demo getInstance(){
        return  obj;
    }

}
