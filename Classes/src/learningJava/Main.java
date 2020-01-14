package learningJava;

public class Main {

    public static void main(String[] args) {
        // initialize.
        Honda hondaSUV = new Honda();
        System.out.println(hondaSUV.getGears());
        System.out.println(hondaSUV.getSpeed());
        hondaSUV.changeGears("SUV's gear.");
        hondaSUV.changeSpeed(999);
        System.out.println(hondaSUV.getGears());
        System.out.println(hondaSUV.getSpeed());
    }
}
// Class
//  public
//      -- unrestricted access to the class.
//  private
//      -- encapsulation
//          hide, internal.
//  field
//      -- will be automatically initialized.
//      -- boolean : false;
//      -- byte/int/short.long : 0
//      -- char : \u0000
//      -- double/float : 0.0
//      -- String : null
//  constructor
//    -- constructor chaining: always the last constructor initialize the variables.
//      -- this(); call current class constructor
//      -- super(); call parent class constructor.
//      -- a constructor can have a call to super() or this() but never both.
//      -- can be overloaded
//      -- can call another constructor in a constructor.
//      -- it is better to directly assign value to fields in constructor.
//  inheritance
//      -- inherit commonly used standard behavior from other classes
//      -- Eg: A inherit from B ==
//              public class A extends B
//      -- inherit fields can use B's constructor.
//      -- inherit methods.
//      -- super (similar to this)
//          -- super();
//           call to super() must be the first statement in each constructor.
//
//  Class -- blueprint.
//  object/instance -- build based on blueprint.
//  reference -- address pointed to object.
//      -- House blueHouse = new House("blue").
//         blueHouse variable is a reference pointed to the object.
//
//
//  super/this can not used in static.
//  super
//      -- access/call the parent class members
//  this
//      -- call the current class members.
//      This is required when we have a parameter with the same name as an instance variable.
//
//  Method overloading
//      -- several methods with same names but different parameters.
//  Method overriding
//      -- Define a method in a child class that already exists in the parent class with same signature.
//      -- @Override above methods.
//      -- Covariant return type.
//         return type can be a subclass of the return type in the parent class.
//      -- It can not have a lower access modifier. ( parent private, child can be public)
//      -- Only inherited methods can be overridden.
//      -- Can override Constructors and private methods.
//      -- Can not override static methods only instance methods.
//      -- Can not override methods that are final.
//
//  Static
//      -- can't use the this keyword.
//      -- Methods will not be influenced by instances.
//
//  Static variable
//      -- Static member variables.
//      -- Static variables are shared and same for every instance of that class.
//         Instance variables are specific to one instance.
//      -- private static String name;
//  Instance variable
//      -- Instance variables are known as fields or member variables.
//
//  Instance methods
//      -- Instance methods belong to an instance of a class,
//      to use an instance method we have to instantiate the class
//      first usually by using the new keyword.
//      -- Instance methods can call instance/static variables directly.
//      -- Instance methods can call instance/static methods directly.
//
//  Classes are all extended from


