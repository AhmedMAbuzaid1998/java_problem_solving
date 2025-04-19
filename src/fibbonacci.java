public class fibbonacci {
    public static void main(String[] args) {
        int n = 6;
   /*     // first method using iteration
        int a=0,b=1;
        int result = 0;
        for(int i=0;i<=n;i++)
        {
            if (i<=1)
            {
                result=i;
            }
            else
            {
                result=a+b;
                a=b;
                b=result;
            }

        }
        System.out.println("the fibonacci of the number is " + result);
*/


        //second method using recursive function
        int result;
        result = fab(n);
        System.out.println("the fibonacci of the number is " + result);


    }

    private static int fab(int x) {
        int fab_res;
        if (x <= 1) {
            fab_res = x;
        } else {
            fab_res = fab(x - 1) + fab(x - 2);
        }
        return fab_res;
    }
}