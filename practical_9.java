import java.util.*;

class practical_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter power (b): ");
        int b = sc.nextInt();

        int result = 1;

        for (int i = 1; i <=b; i++) {

            int temp = 0;

            for (int j = 1; j <= a; j++) {
                temp = temp + result;   
            }

            result = temp;
        }

        System.out.println("Result = " + result);
    }
}