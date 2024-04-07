interface Flyable {
     void fly();
}

interface Swimmable {
     void swim();
}

class Bird implements Flyable,Swimmable {

	public void fly() {
	  System.out.println("The Bird is Flying in the Sky");
   }

 	public void swim() {
	   System.out.println("The Bird is Swimming in the Lake.");
   }
}


public class interfaces {

	public static void main(String[] args){
	  Bird bird=new Bird();
    
          bird.fly();
          bird.swim();
  }
}