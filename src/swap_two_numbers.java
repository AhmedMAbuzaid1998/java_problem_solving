public class swap_two_numbers {
    public static void main(String []args){
        int num1=5,num2=19,v;
        System.out.println("before swapping number1= "+num1+" number2= "+num2);
        /*
   // method 1
    v=num1;
    num1=num2;
    num2=v;
        System.out.println("after swapping number1= "+num1+" number2= "+num2);

         */

        /*
     //method 2
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
        System.out.println("before swaping number1= "+num1+" number2= "+num2);
*/

    // method 3
    num1=num1^num2;
    num2=num1^num2;
    num1=num1^num2;
        System.out.println("before swapping number1= "+num1+" number2= "+num2);
    }
}
