import java.util.*;

class ReverseSpecial {

    public static void main(String[] args) {

        String str = "a!!!b.c.d,e'f,ghi";

        char arr[] = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (!Character.isLetter(arr[left])) {
                left++;
            }
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(new String(arr));
    }
}


// input:: a!!!b.c.d,e'f,ghi
// output :: i!!!h.g.f,e'd,cba