import java.util.*;

class practical_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, num;
        int max, min;
        double sum = 0;

        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        System.out.print("Enter number: ");
        num = sc.nextInt();

        max = num;
        min = num;
        sum = num;

        for (int i = 2; i <= n; i++) {

            System.out.print("Enter number: ");
            num = sc.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

            sum = sum + num;
        }

        double avg = sum / n;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + avg);

    }
}