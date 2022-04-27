package operator;

public class LearnUnaryOperator {

    //unary operator
    // increment operator: ++
    //pre increment operator: adding 1 Before with the variable value (1+20)
    //post increment operator: adding 1, not with the present value but for the future value


    //Decrement operator: --
    //pre Decrement operator: Before ( --1)
    //post Decrement operator: After ( 1--)

    public static void main(String[] args) {
      int num =30;
      ++num; //pre increment 1+30=31
      ++num; //pre increment 1+31=32
      ++num; //pre increment 1+32=33
        //System.out.println(num);

        num++;
        num++;
        ++num;
        ++num;
        ++num;
        --num;
        --num;
        System.out.println(num++);
    }




}
