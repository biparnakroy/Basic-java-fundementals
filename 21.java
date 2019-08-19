/*Question:
Write a program to declare a square matrix A[][] of order M x M where  ‘M’ is the number of rows and the number of columns, such that M must be greater than 2 and less than 10. Accept the value of M as user input. Display an appropriate message for an invalid input. Allow the user to input integers into the matrix. Perform the following tasks:  
a)	Display the original matrix. 
b)	Rotate the matrix 90º clockwise as shown below:
Original matrix   		Rotated matrix 
1 2 3    			7 4 1 
4 5 6     			8 5 2 
7 8 9     			9 6 3
c) Find the sum of the elements of the four corners of the matrix. Test your program for the following data and some random data:  
Example 1: 
INPUT : 		
M=3
3   4   9    
2   5   8    
1   6   7
OUTPUT: 
ORIGINAL MATRIX  
3 	4 	9    
2 	5 	8    
1 	6 	7  
MATRIX AFTER ROTATION  
1 	2 	3    
6 	5 	4    
7 	8 	9  
Sum of the corner eements= 20
Example 2: 
INPUT :  M=4    
1 	2 	4 	9    
2 	5 	8 	3    
1 	6 	7 	4    
3 	7 	6 	5  
OUTPUT: 
ORIGINAL MATRIX     
1 	2 	4 	9    
2 	5 	8 	3    
1 	6 	7 	4    
3 	7 	6 	5  
MATRIX AFTER ROTATION  
3 	1 	2 	1    
7 	6 	5 	2    
6 	7 	8 	4    
5 	4 	3 	9  
Sum of the corner elements= 18  
EXAMPLE 3.  
INPUT :  M = 14  
*/
/* Algorithm:
Main()
Step 1.	Start
Step 2.	Initialize BufferedReader and other variables, take input
Step 3.	Print Original matrix
Step 4.	Initialize output matrix
Step 5.	Run loop from 0 to length, and the using counter j start nested loop to rotate and store elements
a.	for(inti=0;i<l;i++)
b.	{
c.	for(int j=0;j<l;j++)
d.	   out[i][j]=a[l-1-j][i];/**Rotating the matrix and storing*/
e.	}
Step 6.	Print output matrix
Step 7.	Print sum of corner elements
a.	System.out.println("Sum of all corner elements: "+(out[0][0]+out[0][l-1]+out[l-1][0]+out[l-1][l-1]));
Step 8.	Stop
*/
//code:
import java.io.*;
class Rotate_21
{
    public static void main(String args[])throws IOException
    {
BufferedReaderbr= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of square matrix: ");
int l=Integer.parseInt(br.readLine());
int[][] a=new int [l][l];
for(inti=0;i<l;i++)/**Input*/
        {
for(int j=0;j<l;j++)
            {
System.out.print("Input for a["+i+"]["+j+"]: ");
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
System.out.println("Original Matrix: ");
for(inti=0;i<l;i++)
        {
for(int j=0;j<l;j++)
System.out.print(a[i][j]+"\t");
System.out.println();
        }
int[][] out=new int[l][l];
for(inti=0;i<l;i++)
        {
for(int j=0;j<l;j++)
                out[i][j]=a[l-1-j][i];/**Rotating the matrix and storing*/
        }
System.out.println("Clockwise Rotated Matrix: ");
for(inti=0;i<l;i++)/**Output*/
        {
for(int j=0;j<l;j++)
System.out.print(out[i][j]+"\t");
System.out.println();
        }
        /**Sum of corner elements*/
System.out.println("Sum of all corner elements: "+(out[0][0]+out[0][l-1]+out[l-1][0]+out[l-1][l-1]));
    }/**end of main()*/
}/**end of class*/
