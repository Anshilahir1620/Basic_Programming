import java.util.*;

class P21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal: ");
        int num = sc.nextInt();

        String hex = Integer.toHexString(num);

        System.out.println("Hexadecimal = " + hex);
    }
}