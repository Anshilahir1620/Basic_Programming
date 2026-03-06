import java.util.*;

class practical_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter hour: ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();

        double hour_aegel = (hour *30) + (minutes*0.5);
        double minuteAngle = minutes * 6;

        double angal = Math.abs( hour_aegel  - minuteAngle);



        if(angal > 180)
        {
            angal = 360 - angal;
        }

        System.out.println(angal);

    
       
    }
}