import java.util.*;

class Practical3 {

    public static void main(String[] args) {

        int num = 123456;
        int even = 0;
        int odd = 0;

        while (num != 0) {

            int digit = num % 10;

            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            num = num / 10;
        }

        System.out.println("Total Even Digits: " + even);
        System.out.println("Total Odd Digits: " + odd);
    }
}