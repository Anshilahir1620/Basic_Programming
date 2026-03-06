import java.util.*;

class DecodePattern {

    public static void main(String[] args) {

        String str = "2a3bc4dE5F2G7H";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                int num = str.charAt(i) - '0';
                char ch = str.charAt(i + 1);

                for (int j = 0; j < num; j++) {
                    System.out.print(ch);
                }

                i++; // skip character
            }
            else {
                System.out.print(str.charAt(i));
            }
        }
    }
}


// Input: 2a3bc4dE5F2G7H
// Output: aabbbcddddEFFFFFGGHHHHHHH