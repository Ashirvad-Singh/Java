package week1;

import java.util.Scanner;

public class day1 {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input three numbers: A, B, and C
        System.out.println("Enter three numbers:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // // Calculate the average
        float N = (A + B + C) / 3;

        // // Output the average
         System.out.println("The average of the three numbers is: " + N);

        //Enter cost of 3 items from the user(usingfloatdatatype)
        // -a pencil,a pen  and an eraser. You have to output the total 
        // cost of the items back to the user as their bill.
        // (Add on : You can also try adding 18% gst tax to the items 
        // in the bill as an advanced problem   
        System.out.println("Enter the thing value:");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();  
        float total=pen+pencil+eraser;
        System.out.println("Bill is:"+total);
        float newTotal=total+(0.18f*total);
        System.out.println("Cost After GST:"+newTotal);
    }
}
