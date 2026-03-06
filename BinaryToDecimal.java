import java.util.*;

class P17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary: ");
        String bin = sc.nextLine();

        int decimal = Integer.parseInt(bin,2);

        System.out.println("Decimal = " + decimal);
    }
}