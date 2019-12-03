public class Factorial {

    //Object created to catch error in methods
    private static Object IllegalArgumentException;

    public static void main(String[] args){


        //Tests different cases for each method
        for (int i = -1; i <= 15; i++)
        {
            try
            {
                System.out.println("Iterative output for " + i + " input: " + iterative(i));
            }
            catch (Exception e)
            {
                System.out.println("Iterative error for " + i + " input");
            }
            try
            {
                System.out.println("Pure recursion output for " + i + " input: " + pureRecursive(i));
            }
            catch (Exception e)
            {
                System.out.println("Pure recursion error for " + i + " input");
            }
            try
            {
                System.out.println("Tail recursion output for " + i + " input: " + tailRecursive(i));
            }
            catch (Exception e)
            {
                System.out.println("Tail recursion error for " + i + " input");
            }
            System.out.println("");
        }
    }


    public static Long pureRecursive(int n){

        //Checks to see if input is valid
        if(n>0) {

            if (n > 1) {
                return n * pureRecursive(n - 1);
            } else {
                long end = 1;
                return end;
            }
        }
        else{
            return (long)IllegalArgumentException;
        }


    }

    public static Long tailRecursive(int n){

        //Checks to see if input is valid
        if(n > 0) {
            //Calls helper method to do the factorial
            return tail(n, 1);
        }
        else {
            return (long)IllegalArgumentException;
        }
    }

    private static Long tail(int n, long result){
        if(n == 1){
            return result;
        }
        else{
           return tail(n-1, n * result);
        }
    }

    public static Long iterative(int n) {

        //Checks to see if input is valid
        if (n > 0) {

            long result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            return result;
        } else {
            return (long)IllegalArgumentException;
        }
    }
}
