import java.util.*;

class P20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal: ");
        int num = sc.nextInt();

        String oct = Integer.toOctalString(num);

        System.out.println("Octal = " + oct);
    }
}