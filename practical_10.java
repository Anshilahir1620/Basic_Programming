import java.util.*;

class practical_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first (a): ");
        int first = sc.nextInt();

        System.out.print("Enter second (b): ");
        int second = sc.nextInt();

        int bignum , smallnum;
        if(first > second)
        {
            bignum = first;
            smallnum = second;
        }
        else{
            bignum = second;
            smallnum = first;
        }

        int quotient =0;
        while(bignum>= smallnum)
        {
            bignum = bignum - smallnum;
            quotient++;

        }
        int remainder = bignum;


        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}