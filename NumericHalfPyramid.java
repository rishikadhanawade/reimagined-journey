//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
import java.util.Scanner;

public class NumericHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter a size");
        int n = new Scanner(System.in).nextInt();
        for(int row=0;row<n;row=row+1)
        {
            for(int col=0;col<=row;col=col+1)
            {
                System.out.print(col+1+" ");
            }
            System.out.println();
        }

    }
}

