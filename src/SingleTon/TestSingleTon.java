package SingleTon;

public class TestSingleTon {


    public static void main(String[] args) {
        //Syntax: ClassName referenceVariable/ObjectName=ClassName.publicReturnTypeMethod();
        LearnSingleton herPizza= LearnSingleton.getInstance();

        LearnSingleton getPizza =new LearnSingleton("Margarita");
        LearnSingleton hisPizza=new LearnSingleton("FourSeason",20.00);
        System.out.println(herPizza.pizzaPrice);
        //System.out.println(herPizza.pizzaName + herPizza.pizzaPrice);





        herPizza.pizzaPrice=5.50;
        getPizza.pizzaName="Dominoes";
        System.out.println("Reassign pizza name to "+getPizza.pizzaName);
        System.out.println("Reassign pizza Price to "+getPizza.pizzaPrice);
    }





}
