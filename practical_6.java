import java.util.*;

class Practical_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int sum =0;

        while(num!=0)
        {
            int teamp = num %10;
            sum = sum + (teamp*teamp*teamp);
            num = num/10;
        }
        if(sum==original)
        {
            System.out.println("Number Is Armstrong");
        }
        else{
            System.out.println("Number Is Not Armstrong");
        }
    
    }
}



// 9⁴ + 4⁴ + 7⁴ + 4⁴
// = 6561 + 256 + 2401 + 256
// = 9474


// import java.util.*;

// class Practical6 {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int original = num;
//         int sum = 0;
//         int digits = 0;

//         int temp = num;

//         // Count digits
//         while (temp != 0) {
//             digits++;
//             temp = temp / 10;
//         }

//         temp = num;

//         // Armstrong calculation
//         while (temp != 0) {

//             int digit = temp % 10;
//             sum += Math.pow(digit, digits);
//             temp = temp / 10;
//         }

//         if (sum == original) {
//             System.out.println("Armstrong Number");
//         } 
//         else {
//             System.out.println("Not an Armstrong Number");
//         }

//     }
// }