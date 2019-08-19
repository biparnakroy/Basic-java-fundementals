/* 
Question:
Write a program to declare a square matrix A[][] of order MxM where ‘M’ is the number of rows and the number of columns, such that M must be greater than 2 and less than 10. Accept the value of M as user input. Display an appropriate message for an invalid input. Allow the user to input integers into this matrix. Perform the following tasks: 
a)      Display the original matrix. 
b)      Check if the given matrix is symmetric or not. A square matrix is said to be symmetric, if the element in the ith row and jth column is equal to the element of the jth row and ith column. 
c)      Find the sum of the elements of left diagonal and the sum of the elements of right diagonal of the matrix and display them. 
Test your program for the following data and some random data:
Example 1
INPUT:           M= 3            
1          2          3
2          4          5            
3          5          6 
OUTPUT: ORIGINAL MATRIX            
1          2          3            
2          4          5            
3          5          6 
THE GIVEN MATRIX IS SYMMETRIC 
The sum of the left diagonal = 11 
The sum of the right diagonal = 10
Example 2 
INPUT:           M= 4            
7          8          9          2            
4          5          6          3            
8          5          3          1                      
7          6          4          2 
OUTPUT: ORIGINAL MATRIX 
7          8          9          2            
4          5          6          3            
8          5          3          1                      
7          6          4          2            
THE GIVEN MATRIX IS NOT SYMMETRIC
The sum of the left diagonal = 17 
The sum of the right diagonal = 20
Example 3 
INPUT:           M= 12            
OUTPUT:       THE MATRIX SIZE IS OUT OF RANGE
*/
/* Algorthim:
Main()
Step 1.	Start
Step 2.	Initialize BufferedReader, and take input from user
Step 3.	Enter if-construct if n>2 and n<10, else print error message
Step 4.	Create array
Step 5.	Enter for loop construct for input for the elements of the array
Step 6.	Initialize variables
Step 7.	Print original array and calculate sum of left diagonal elements and right diagonal elements
Step 8.	Se boolean check as true, and then enter loop construct to check whether the array is symmetric or not
a.	for(inti=0;i<a.length;i++)
b.	{
c.	for(int j=0;j<a[0].length;j++)
d.	       {
e.	           if(a[i][j]!=a[j][i])
f.	           {
g.	                 check=false;
h.	                 break;
i.	              }
j.	         }
k.	System.out.println();
l.	}
Step 9.	Print output
Step 10.	Stop.
*/
//code:
import java.io.*;
class Symmetric_23
{
    public static void main(String args[])throws IOException
    {
BufferedReaderbr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of the matrix: ");
int n=Integer.parseInt(br.readLine());
        if(n>2&&n<10)/**Boundary Conditions*/
        {
inta[][]=new int[n][n];
for(inti=0;i<a.length;i++)/**Input*/
            {
for(int j=0;j<a[0].length;j++)
                {
System.out.print("Input for a["+i+"]["+j+"]: ");
                    a[i][j]=Integer.parseInt(br.readLine());
                }
            }
System.out.println("Original Array:- ");
intld=0;intrd=0;
for(inti=0;i<a.length;i++)
            {
for(int j=0;j<a[0].length;j++)
                {
System.out.print(a[i][j]+ "\t");/**Sum of diagonals is calculated below*/
ld=(i==j)?ld+a[i][j]:ld;
rd=((i+j)==(n-1))?rd+a[i][j]:rd;
                }
System.out.println();
            }
boolean check=true;
for(inti=0;i<a.length;i++)
            {
for(int j=0;j<a[0].length;j++)
                {
                    if(a[i][j]!=a[j][i])/**Symmetry checking condition*/
                    {
                        check=false;
                        break;
                    }
                }
System.out.println();
            }
System.out.println((check==true)?"THE GIVEN MATRIX IS SYMMETRIC.":"THE GIVEN MATRIX IS NOT SYMMETRIC.");
System.out.println("The sum of left diagonal elements: "+ld+"\nThe sum of the right diagonal elements: "+rd);
        }
        else
System.out.println("INVALID INPUT!");
    }/**end of main()*/
}/**end of class*/
