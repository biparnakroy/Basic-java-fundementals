/* Question:
Write a Program in Java to fill a square matrix of size N*N in a circular fashion (clockwise) with natural numbers from 1 to N*N, taking ‘N’ as input.
For example: if N = 4, then N*N = 16, hence the array will be filled as given below
---------------------
| 01 | 02 | 03 | 04 |
---------------------
| 12 | 13 | 14 | 05 |
---------------------
| 11 | 16 | 15 | 06 |
---------------------
| 10 | 09 | 08 | 07 |
---------------------
*/
/* Algorithm:
We will take a variable ‘k’ which will begin with 1 and will do the work of filling. i.e. for every cell, it will increase by 1. The below given processes will repeat till the value of ‘k’ becomes ‘n*n’
•	C1 denotes the index of the column from where we have to begin. Hence its initial value will be 0.
•	C2 denotes the index of the column where we have to end. Hence its initial value will be ‘n-1’ (n is the size of the matrix).
•	R1 denotes the index of the row from where we have to begin. Hence its initial value will be 0.
•	R2 denotes the index of the row where we have to end. Hence its initial value will be ‘n-1’ (n is the size of the matrix).
The filling up of the matrix in circular fashion will consist of 4 different steps which will continue till the matrix is filled completely.
Step 1: We will fill the elements of Row 0 (R1), starting from Column 0 (C1) till ‘n-1’ (C2). The cells which will be filled are marked in the image above in yellow color.
The elements will be accessed as follows: A[R1][i], where ‘i’ will go from C1 to C2 (A[ ][ ] is the array)
Step 2: Now, we will fill the elements of Column ‘n-1’ (C2), starting from Row R1+1 till R2. The cells which will be filled are marked in the image above in grey color.
The elements will be accessed as follows: A[j][C2], where ‘j’ will go from R1+1 to R2 (A[ ][ ] is the array)
Step 3: Next we will fill the elements of Row ‘n-1’ (R2), starting from Column C2-1 till C1. The cells which will be filled are marked in the image above in green color.
The elements will be accessed as follows: A[R2][i], where ‘i’ will go from C2-1 to C1 (A[ ][ ] is the array)
Step 4: Now, we will fill the elements of Column C1, starting from Row R2-1 till R1+1. The cells which will be filled are marked in the image above in blue color.
The elements will be accessed as follows: A[j][C1], where ‘j’ will go from R2-1 to R1+1 (A[ ][ ] is the array)
The above 4 steps will now repeat with the inner matrix which is marked in white color in the above image. For the inner matrix,
C1 will increase by 1 i.e. it will be C1+1.
C2 will decrease by 1 i.e. it will be C2-1.
R1 will increase by 1 i.e. it will be R1+1.
R2 will decrease by 1 i.e. it will be R2-1.
The above processes will repeat till we have filled in ‘n*n’ values.
*/
//code:
import java.util.*;
class Spiral_Matrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        int A[][] = new int[n][n];
        int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
        while(k<=n*n)
        {
            for(int i=c1;i<=c2;i++)
            {
                A[r1][i]=k++;
            }
            for(int j=r1+1;j<=r2;j++)
            {
                A[j][c2]=k++;
            }
            for(int i=c2-1;i>=c1;i--)
            {
                A[r2][i]=k++;
            }
            for(int j=r2-1;j>=r1+1;j--)
            {
                A[j][c1]=k++;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        /* Printing the Circular matrix */
        System.out.println("The Circular Matrix is:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
