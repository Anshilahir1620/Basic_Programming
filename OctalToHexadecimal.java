import java.util.*;

class P18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Octal: ");
        String oct = sc.nextLine();

        int decimal = Integer.parseInt(oct,8);
        String hex = Integer.toHexString(decimal);

        System.out.println("Hexadecimal = " + hex);
    }
}