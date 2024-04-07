abstract class Vehicle {
	abstract void start();
 }

class Car extends Vehicle {
	void start() {
	  System.out.println("Car has Started");
   }
}

public class Abstract {
  public static void main(String[] args) {
     
  Car car=new Car();

  car.start();
    }	
}