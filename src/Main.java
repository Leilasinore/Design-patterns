//introduction to design patterns in using Java
//first covers the main concepts of java that will be required

//notes
//static key word means we can call this method directly without having to create an instance of the main class

//class attributes are variables within a class.
//we can have access to these attributes by creating an object using the class then
//accessing those methods using the (.) notation.
//we can overide these methods but if we do not want to we can just put the final key word before it
//The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
//class is a blueprint for creating objects.

public class Main {
    public static void main(String[] args) {

        User newuser= new User("Leila");

        System.out.println(newuser.name);

        newuser.sayHello();
    }
}