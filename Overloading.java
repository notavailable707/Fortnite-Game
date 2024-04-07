public class Calculator {

   public int substract(int a ,int b) {
    return a - b;
}
   public int add(int a, int b, int c)  {
     return a + b + c;
}
   public double add(double a, double b) {
     return a + b;
}
   public double add(double a ,double b, double c) {
    return a + b + c;
}
       public static void main(String[] args) {
    Calculator calculator=new Calculator();
 
   System.out.println("Substraction of the 88 From 98 is :" +calculator.substract(98,88));

System.out.println("Sum of the 8 & 5 & 9 is :" +calculator.add(5,8,9));

System.out.println("Sum of the Double 127.3 & 3.4 is :" +calculator.add(127.3,3.4));

System.out.println("Sum of the Double 2.2 & 8.6 & 7.3 is :" +calculator.add(2.2,8.6,7.3));
}
}
