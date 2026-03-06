import java.util.*;

class P19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hexadecimal: ");
        String hex = sc.nextLine();

        int decimal = Integer.parseInt(hex,16);
        String oct = Integer.toOctalString(decimal);

        System.out.println("Octal = " + oct);
    }
}