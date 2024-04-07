public class Person {
    // Instance variables
    private String name;
    private int age;
    
    // Default Constructor
    public Person() {
        // Default values
        this.name = "Unknown";
        this.age = 0;
    }
    
    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Copy Constructor
    public Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;
    }
    
   
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
       
        Person person1 = new Person();
        Person person2 = new Person("John", 30);
        Person person3 = new Person(person2);
        
        System.out.println("Person 1:");
        person1.displayInfo();
        
        System.out.println("\nPerson 2:");
        person2.displayInfo();
        
        System.out.println("\nPerson 3 (Copy of Person 2):");
        person3.displayInfo();
    }
}
