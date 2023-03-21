//*****
// ***
//  *

import java.util.Scanner;

public class InvertedPyramid {
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
            // to print st/ar
            for(int star=0;star<2*n-2*row-1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
