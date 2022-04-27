package learnMethod;

public class LearnConstructor {

        // constructor we use, to initialize  object or create object
        //Constructor has no return type
        //constructor name should be same name as class name


        String mobilePhoneN;
        int mobilePhoneRamSize;
        String mobilePhoneColor;
        double mobilePhonePrice;
        //syntax of constructor
        //accessModifier className/constructorOfClass
        public LearnConstructor() {
            //this is default constructor (non parameterize)
            System.out.println("we are learning Constructor");
        }


        public LearnConstructor(String mobilePhoneName) {
            //This is single parameterize constructor
            this.mobilePhoneN=mobilePhoneName;  // This "this" keyword is use to call global variable inside a method/constructor
            System.out.println("My mobile ph is:" +this.mobilePhoneN);
        }

        public LearnConstructor(String mobilePhoneName, int mobilePhoneRamSize) {
                                             ////This is multi parameterize constructor
            this.mobilePhoneN=mobilePhoneName;
            //System.out.println(mobilePhoneN);
            //System.out.println("my phone name is: "+this.mobilePhoneN);
            this.mobilePhoneRamSize=mobilePhoneRamSize;
           // System.out.println(mobilePhoneRamSize);
            System.out.println("My phone ram size is: "+this.mobilePhoneRamSize+" \n"+"My phone name is: "+ this.mobilePhoneN);

        }

        public LearnConstructor(String mobilePhoneName, int mobilePhoneRamSize, String mobilePhoneColor ) {
            //This is multi parameterize constructor
            this.mobilePhoneN=mobilePhoneName;
            System.out.println(mobilePhoneN);
            this.mobilePhoneRamSize=mobilePhoneRamSize;
            System.out.println(mobilePhoneRamSize);
            this.mobilePhoneColor=mobilePhoneColor;
            System.out.println("My phone color is: "+this.mobilePhoneColor);
        }
        public LearnConstructor(String mobilePhoneName, int mobilePhoneRamSize, String mobilePhoneColor, double mobilePhonePrice ) {


        }

        public LearnConstructor(String mobilePhoneName, int mobilePhoneRamSize, double mobilePhonePrice, String mobilePhoneColor ) {
            //This is multi parameterize constructor
        }
        //last 2 parametrization dataType signature pattern must have to change, it can not be the pattern



        public static void main(String[] args) {


            //create object and declaring value.
            LearnConstructor objConstructor=new LearnConstructor(); //this is default constructor

            LearnConstructor objConstructor1=new LearnConstructor("iPhone 13 pro max"); //after writing "new" keyword make space, then ctrl+space (all parameterize will suggest)
            LearnConstructor objConstructor2=new LearnConstructor("lg",16 );
            LearnConstructor objConstructor3=new LearnConstructor("galaxy note 13",12, "rose gold" );







        }


    }




