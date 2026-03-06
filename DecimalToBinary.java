import java.util.*;

class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();

        String s = Integer.toString(num);

        for(char c : s.toCharArray())
        {
            int digit = c - '0';
            System.out.print(String.format("%4s", Integer.toBinaryString(digit)).replace(' ','0') + " ");
        }
    }
}