import java.util.*;

class practical_1 {

    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
         int num=5;
         int sum =1;

         for(int i=1 ;i<=num ; i++)
         {
            sum = sum * i ;
         }
         System.out.println(sum);

      int fac  = factorialRecursive(num);
      System.out.println(fac)
}



}