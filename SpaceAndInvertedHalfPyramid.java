//****
// ***
//  **
//   *

import java.util.Scanner;

public class SpaceAndInvertedHalfPyramid {

    public static void main(String[] args) {
        System.out.println("Enter a size");
        int n = new Scanner(System.in).nextInt();
        for(int row=0;row<n;row++)
        {
            // to print space
            for(int space=0;space<row;space++)
            {
                System.out.print(" ");
            }
            // to print star
            for(int star=0;star<n-row;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
