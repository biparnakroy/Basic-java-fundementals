/*
Quuestion: 
Write a program, to accept an N * M array from user and accept all data.

The program, should have option to rotate the array and print in 90°, 180°  
For example:- 
4 * 4

1	  2  	3 	4
5	  6	  7	  8
9	  10	11	12
13	14	15	16


Enter 1 to rotate 90°
Enter 2 to rotate 180°

For 1

Output:- 

13	9	  5	1
14	10	6	2
15	11	7	3
16	12	8	4

For 2

16	15	14	13
12	11	10	9
8  	7	  6	  5
4  	3 	2 	1
*/
/* Algorithm:
Step 1: Start 
Step 2: Accept number of rows and columns of array and create an array
Step 3: Accept values of array from the user and display the array
Step 4: Present user with choice to rotate array by 90 degrees or 180 degrees
              If user chooses 90 degrees goto Step 5
              If user chooses 180 degrees goto Step 6
Step 5: Create an array with reverse number of rows and columns compared to that of prior array and
              fill accordingly
              Display the rotated array
               Goto Step 7
Step 6: Create another array of same size but fill the array in reverse compared to prior array
              Display the rotated array
              Goto Step 7
Step 7: Stop.
*/
//code:
import java.util.*;
class rotate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
System.out.println("Enter number of rows and columns");
int n=in.nextInt();
int m=in.nextInt();
intarr[][]=new int[n][m];
for(inti=0;i<n;i++)
        {
for(int j=0;j<m;j++)
            {
System.out.println("Enter a value");
arr[i][j]=in.nextInt();
            }
        }
for(inti=0;i<n;i++)
        {
for(int j=0;j<m;j++)
System.out.print(arr[i][j]+"\t");
System.out.println();
        }
System.out.println("Enter 1 to rotate by 90 degrees and 2 to rotate by 180 degrees");
int x=in.nextInt();
        switch(x)
        {
            case 1:
intnewarr[][]=new int[m][n];
for(inti=0;i<n;i++)
            {
for(int j=0;j<m;j++)
newarr[j][n-i-1]=arr[i][j];
            }
for(inti=0;i<m;i++)
            {
for(int j=0;j<n;j++)
System.out.print(newarr[i][j]+"\t");
System.out.println();
            }
            break;
            case 2:
int newarr2[][]=new int[n][m];
for(inti=0;i<n;i++)
            {
for(int j=0;j<m;j++)
                    newarr2[n-i-1][m-j-1]=arr[i][j];
            }
for(inti=0;i<n;i++)
            {
for(int j=0;j<m;j++)
System.out.print(newarr2[i][j]+"\t");
System.out.println();
            }
            break;
            default:
System.out.println("INCORRECT INPUT");
        }
    }
}
