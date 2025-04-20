public class check_even_odd_number_and_prime_or_not {

    public static void main(String[] args) {
        //(task 2)the number is even or odd and prim or not prim
        int a = 5;
        if ((a % 2) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        if ((a == 0) || (a == 1)) {
            System.out.println("not prim number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= a - 1; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not prime number");
            }
        }


        /*
    // task(2) optimization
    //optimize in memory (not using another variable)
     int a=7,i;
    if((a%2)==0)
    {
        System.out.println("even number");
    }
    else
    {
        System.out.println("odd number");
    }
    if ((a==0)||(a==1))
    {
        System.out.println("not prim number");
    }
    else
    {
        for(i=2;i<=a-1;i++)
      {
            if(a%i==0)
            {
                break;
            }
      }
    if(i==a)
    {
        System.out.println("prim number");
    }
    else
    {
        System.out.println("not prim number");
    }
    }
}*/
    }
}
