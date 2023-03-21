//*
//* *
//* * *
//* * * *
//* * * * *
import java.util.Scanner;
public class HalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter a size");
        int n = new Scanner(System.in).nextInt();
        for(int row=0;row<n;row=row+1)
        {
            for(int col=0;col<=row;col=col+1)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}