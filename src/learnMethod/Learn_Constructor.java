package learnMethod;

public class Learn_Constructor {
    //syntax of constructor:  accessModifier className/constructorOfClass(){ }

    String yourFirstName;
    String yourLastName;
    int yourAge;
    int yourHouseNumber;
    String yourCityName;
    char dressSize;
    double yourSalary;



    public Learn_Constructor(){
        //Any Constructor without parameter called default Constructor
        System.out.println("This is default Constructor");
    }
    public Learn_Constructor(String firstName){
        //parameterize Constructor
        System.out.println("This is single parameter Constructor");
        this.yourFirstName=firstName;
        System.out.println("This is single parameter Value First Name:  "+ this.yourFirstName);
    }
    public Learn_Constructor( String lastName,int age){
        //parameterize Constructor
        System.out.println("This is double parameter Constructor");
        this.yourLastName=lastName;
        this.yourAge=age;
        System.out.println("Your last name is: "+this.yourLastName+" "+ "Your age is: "+this.yourAge);
    }
    public Learn_Constructor(String firstName, String lastName, int age){
        //parameterize Constructor
        this.yourFirstName=firstName;
        this.yourLastName=lastName;
        this.yourAge=age;
        System.out.println( "Your first name is: " +this.yourFirstName+" "+  "Your last name is: "+this.yourLastName+" " + "Your last name is: "+this.yourAge);
    }
    public Learn_Constructor(String firstName, String lastName, int age, double salary){
        //parameterize Constructor
        this.yourFirstName=firstName;
        this.yourLastName=lastName;
        this.yourAge=age;
        this.yourSalary=salary;
        System.out.println( "Your first name is: " +this.yourFirstName+ "Your last name is: " + this.yourLastName+ "Your last name is: " + this.yourAge + "your Salary : " +this.yourSalary );
    }
public Learn_Constructor(int houseNumber,String cityName,char dressSize){
        this.yourHouseNumber=houseNumber;
        this.yourCityName=cityName;
        this.dressSize=dressSize;
    System.out.println("Your house no is: "+ this.yourHouseNumber + " "+ "your city Name: "+this.yourCityName+ "your dress size "+ this.dressSize);

}
    public static void main(String[] args) {
        //Syntax of create object: ClassName Object Name =New ConstructorOfAClass();
        Learn_Constructor constructorObject= new Learn_Constructor();
        Learn_Constructor constructorObject1= new Learn_Constructor("Tahmina");
        Learn_Constructor constructorObject2= new Learn_Constructor("Rashid",33);
        Learn_Constructor constructorObject3= new Learn_Constructor("Tahmina","Rashid",33);
        Learn_Constructor constructorObject4= new Learn_Constructor("Tahmina","Rashid",33 ,1500.00 );
        Learn_Constructor constructorObject5= new Learn_Constructor(25,"NY",'M');

    }


}
