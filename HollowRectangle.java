//*****
//*   *
//*   *
//*   *
//*****

import java.awt.*;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        System.out.println("Enter a size");
        int n = new Scanner(System.in).nextInt();
        for(int row=0;row<n;row=row+1)
        {
            for(int col=0;col<n;col=col+1)
            {
                if(row==0||row==n-1||col==0||col==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
