//*****
//*  *
//* *
//**
//*

import java.util.Scanner;

public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {

        System.out.println("Enter a size");
        int n = new Scanner(System.in).nextInt();
        for(int row=0;row<n;row++)
        {
            for(int col=row;col<n;col++)
            {
                if(col==row||row==0||col==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
