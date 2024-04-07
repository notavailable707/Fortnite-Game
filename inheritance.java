class Animal {
void makesound() {
System.out.println("The Animal is Making Sound");
    }
}

class Dog extends Animal {
void makesound() {
 System.out.println("The Dog is Barking at the Theif");
   }
}

class Cat extends Animal {
void makesound() {
 System.out.println("The Cat is Mewoing at the Owner");
   }
}

public class inheritance {
 public static void main(String[] args){

Animal animal=new Animal();
Dog dog=new Dog();
Cat cat=new Cat();


  animal.makesound();
  dog.makesound();
  cat.makesound();
    }
}