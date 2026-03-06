import java.util.*;

class practical_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int square = num * num;

        int temp = num;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        int divisor = (int)Math.pow(10, digits);

        int right = square % divisor;
        int left = square / divisor;

        if ((left + right) == num) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
    }
}