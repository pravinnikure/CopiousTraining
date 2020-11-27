package Exceptions;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

public class TestAgeException
{
    void ageCheck(int age) throws InvalidAgeException{
        if(age>17 || age<50){
            throw new InvalidAgeException("Employee Invalid");
        }
    }

    public static void main(String args[])
    {
        TestAgeException obj = new TestAgeException();
        try
        {
            obj.ageCheck(60);
        }
        catch (InvalidAgeException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}