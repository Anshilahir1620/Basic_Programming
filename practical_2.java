import java.util.*;

class Practical2 {

    public static int sumRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumRecursive(n / 10);
    }

    public static void main(String[] args) {

        int num = 1234;
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        System.out.println("Iterative Sum of Digits: " + sum);

        int result = sumRecursive(num);
        System.out.println("Recursive Sum of Digits: " + result);
    }
}