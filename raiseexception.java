public class raiseexception 
{
 	public static void main(String[] args)
	{
 	     try
 	     {
	      int result=divide(29,0);
	      System.out.println("Marks: "+result);
	     }

	     catch(ArithmeticException e) {
	     System.out.println("Zero Division Error.");
             }
	 }
       
	 public static int divide(int a, int b)  {
         return a/b; 
         }
}