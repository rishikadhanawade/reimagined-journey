//   *
//  ***
// *****
//*******
import java.util.Scanner;

public class Pyramid2 {

    public static void main(String[] args) {
        System.out.println("Enter a size");
        int n = new Scanner(System.in).nextInt();
        for(int row=0;row<n;row++)
        {
            for(int space=0;space<n-1-row;space++)
            {
                System.out.print(" ");
            }
            for(int star=0;star<2*row+1;star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
