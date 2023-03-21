import java.util.Scanner;
public class HollowHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");
        int n= new Scanner(System.in).nextInt();
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<=row;col++)
            {
                if(row==n-1||col==0||col==row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
