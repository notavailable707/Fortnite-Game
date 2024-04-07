class CustomException extends Exception
{
public CustomException(String message)
{
super(message);
}
}
public class userdefine
{
public static void main(String[] args)
{
try
{
int age = -20;
// Check if age is negative i
if (age < 0)
{
throw new CustomException("Age cannot be negative.");
}
System.out.println("Age: " + age);
}
catch (CustomException e)
{
System.err.println("Error: " + e.getMessage());
}
}
}