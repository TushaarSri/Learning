package com.inheritance;

/*If a subclass constructor does not explicitly call the superclass constructor,
    then the default constructor of the superclass is implicitly invoked by the compiler.
    If a superclass constructor is called using the keyword super,
    then this must be the first statement in the derived class constructor.*/

/* When a subclass constructor calls the superclass constructor, this phenomenon is known as constructor chaining */


/*Example: super.instanceVariable - Here, instanceVariable belongs to the superclass.

public class Square extends Rectangle {
    super.length;  // refers to the length attribute defined in the Rectangle class
}

When an object of the subclass is created it contains the superclass variables but it doesn’t create any superclass object in it.
When subclass object has created the constructor of the superclass is executed but this doesn’t mean that superclass object is created.
Go through the below program and its output.
 */

class Superclass {
    public Superclass() {
        System.out.println("This is Super class constructor");

        System.out.println(this.getClass().getName());
    }
}

class Subclass extends Superclass {
    public Subclass() {
        System.out.println("This is Subclass constructor");

        System.out.println(this.getClass().getName() + "  " +
                super.getClass().getName());
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Subclass Obje = new Subclass();
    }


}
