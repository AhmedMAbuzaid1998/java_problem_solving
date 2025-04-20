public class factorial {
    public static void main(String[] args) {
        int n = 4, res;

       /* // first method with iteration
        int fact=1;
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+n+"= "+fact);*/


        //second method recursive function
        res = fact(n);
        System.out.println("factorial of " + n + "= " + res);

    }

    private static int fact(int x) {
        int val;
        if (x <= 1) {
            val = 1;
        } else {
            val = x * fact(x - 1);
        }
        return val;
    }
}
