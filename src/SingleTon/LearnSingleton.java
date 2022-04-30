package SingleTon;

public class LearnSingleton {
//Singleton class : we are allowed to create one instance of a class at a time
 //using private constructor we can ensure that no more than one object can be created at a time
    // singleton concept with work default constructor

    // first we create private object, then we create public return type method to get the object.
//this mechanism will help us to create obj in diff class, this concept is call singleTon.

    //How to create instance of a class?
    //1) Create a private static object.
    // Syntax:  private static className objectName=new constructorOfClass();
    //2) create a public return type method
    //Syntax: public static ClassName MethodName(){   return ObjectVariable;}

//how to create shortcut constructor:
    //right.click-> Generate-> constructor->
    // (you can select single, or you can select multiple) -> ctrl + select all-> ok-> created
    //to create default constructor, do not select anything -> click OK


    String pizzaName;
    double pizzaPrice;

    // default private constructor
    private LearnSingleton(){
    }

    public LearnSingleton(String myPizzaName){
     this.pizzaName=myPizzaName;
        System.out.println("Pizza name is "+this.pizzaName);

    }

    public LearnSingleton(String myPizzaName, double MyPizzaPrice){
      this.pizzaName=myPizzaName;
      this.pizzaPrice=MyPizzaPrice;
        System.out.println("Pizza name is "+this.pizzaName);
        System.out.println("Pizza price is "+this.pizzaPrice);
    }
    // created private static object
    private static LearnSingleton pizzaObj=new LearnSingleton();

    //create a public return type of method :
    public static LearnSingleton getInstance(){
        return pizzaObj;
    }
    //Return Type: All type of data,void, class type and Object
    // here Pizza is our class we want to return, not data type


}
