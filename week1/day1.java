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

        // Calculate the average
        float N = (A + B + C) / 3;

        // Output the average
        System.out.println("The average of the three numbers is: " + N);

        // Inaprogram,inputthesideofasquare.
        Youhavetooutputtheareaofthesquare.(Hint : area of a square is (side x side))
    }
}
