//this keyword can be used to refer current class instance variable.
// If there is ambiguity between the instance variables
// and parameters, this keyword resolves the problem of ambiguity.


//coupling explained
//if we have a class that is a subclass of another class,everytime we make a change
//to the subclass it will recompile and every parent will have to recompile as well and this
// not good performance -wise

//*the goal here is even though they work together they should not be tightly coupled
//*that is a change in one should not necessitate a change in another so that we do not end up with a cascading queue of changes

//how we fix the above problem/how we build losely coupled applications is using interfaces
//an interface is a contract that specifies the capabilities that a class should provide
public class User {
    public String name;
    public   User (String name){
        this.name=name;
    }
    public void sayHello(){
        System.out.println("Hello there" + name);
    }

}
