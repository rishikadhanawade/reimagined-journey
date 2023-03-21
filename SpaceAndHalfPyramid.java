//    *
//   **
//  ***
// ****
//*****

import java.util.Scanner;

public class SpaceAndHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        int n= new Scanner(System.in).nextInt();
        for (int row=0;row<n;row++)
        {
            for(int space=0;space<n-row-1;space++)
            {
                System.out.print(" ");
            }
            for(int star=0;star<=row;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
