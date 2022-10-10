class car {
    int gears;  // this is th instance variable
    int module;
    String brand;
    String color;

   car(int gears,String brand,String color,int module){
        this.color = color; // this is the  parameterize constructor
        this.brand = brand;
        this.module = module;
        this.gears = gears;

    }
}
public class Construction_demo {

    public static void main(String[] args) {
        car Audi = new car(5,"baja","black",54654);
//        Audi.gears = 5;
//        Audi.module = 16542135;
//        Audi.brand = "baja";
//        Audi.color = "black";
        System.out.println(Audi.brand);
        System.out.println(Audi.module);
        System.out.println(Audi.gears);
        System.out.println(Audi.color);



    }
}
//    Java constructors or constructors in Java is a terminology been used to construct something in our programs. A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.
//
//        In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword, at least one constructor is called.
//
//        Note: It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn’t have any.
//
//        How Constructors are Different From Methods in Java?
//        Constructors must have the same name as the class within which it is defined while it is not necessary for the method in Java.
//        Constructors do not return any type while method(s) have the return type or void if does not return any value.
//        Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
//        Now let us come up with the syntax for the constructor being invoked at the time of object or instance creation.
//
//class Geek
//{
//  .......
//
//          // A Constructor
//          new Geek() {}
//
//  .......
//}
//    // We can create an object of the above class
//// using the below statement. This statement
//// calls above constructor.
//    Geek obj = new Geek();
//    Need of Constructor
//        Think of a Box. If we talk about a box class then it will have some class variables (say length, breadth, and height). But when it comes to creating its object(i.e Box will now exist in the computer’s memory), then can a box be there with no value defined for its dimensions. The answer is no.
//        So constructors are used to assigning values to the class variables at the time of object creation, either explicitly done by the programmer or by Java itself (default constructor).
//
//        When is a Constructor called?
//
//        Each time an object is created using a new() keyword, at least one constructor (it could be the default constructor) is invoked to assign initial values to the data members of the same class.
//
//        The rules for writing constructors are as follows:
//
//        Constructor(s) of a class must have the same name as the class name in which it resides.
//        A constructor in Java can not be abstract, final, static, or Synchronized.
//        Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
//        So by far, we have learned constructors are used to initializing the object’s state. Like methods, a constructor also contains a collection of statements(i.e. instructions) that are executed at the time of Object creation.
//
//        Types of Constructors in Java
//        Now is the correct time to discuss types of the constructor, so primarily there are two types of constructors in java:
//
//        No-argument constructor
//        Parameterized Constructor
//        1. No-argument constructor
//
//        A constructor that has no parameter is known as the default constructor. If we don’t define a constructor in a class, then the compiler creates a default constructor(with no arguments) for the class. And if we write a constructor with arguments or no-arguments then the compiler does not create a default constructor.
