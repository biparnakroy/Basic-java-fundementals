/* Question:
Write a program to declare a square matrix A[][] of order (M x M) where 'M' must be greater than 3 and less than 10. Allow the user 
to input positive integers into this matrix. Perform the following tasks on the matrix: a) Sort the non boundary elements in ascending 
order using any standard sorting technique and rearrange them in the matrix. b) Calculate the sum of both the diagonals. 
c) Display the original matrix, rearranged matrix and only the diagonal elements of the rearranged matrix with their sum.
Test your program for the following data and some random data:
Example 1 INPUT: 		 M=4
09  02  01  05
08  13  08  04 
15  06  03  11 
07  12  23  08

OUTPUT: 
ORIGINAL MATRIX
09  02  01  05
08  13  08  04 
15  06  03  11 
07  12  23  08
REARRANGED MATRIX
09  02  01  05 
08  03  06  04 
15  08  13  11 
07  12  23  08 
DIAGONAL ELEMENTS 
09      05
  03  06 
  08  13 
07      08
SUM OF THE DIAGONAL ELEMENTS = 59
Example 2 
INPUT M=3 
OUTPUT: THE MATRIX IS OUT OF RANGE.
*/
/*Algorithm:
Sort():
Step 1.	Start
Step 2.	Accepting array r to sort elements in ascending order 
Step 3.	Using Selection sort technique, start loop with variable i running for the entire array. Initialising int min as i.
a.	for(inti=0;i<n-1;i++)/**No of passes*/
b.	        {
c.	int min=i;
Step 4.	Using int j as counter, selecting minimum element in array and switch.
a.	for(int j=i+1;j<n;j++)/**Selecting the minimum element to switch*/
b.	       {
c.	           if(r[j]<r[min])
d.	              min=j;    
e.	       }
f.	int t=r[i];
g.	       r[i]=r[min];
h.	       r[min]=t;
Step 5.	Return r
Step 6.	Stop. 
Main():
Step 1.	Start.
Step 2.	Initialize Buffered Reader and other values.
Step 3.	If n>=4, we initialize an array, and then input values from user. Else print error message.
Step 4.	We create a new array to store non-boundary elements, and then extract.
a.	for(inti=0;i<a.length;i++)/**Extracting non-boundary elements*/
b.	            {
c.	for(int j=0;j<a[0].length;j++)
d.	                {
e.	                    if(i!=0&&j!=0&&i!=(a.length-1)&&j!=(a[0].length-1))
f.	arg[point++]=a[i][j];    
g.	                }
h.	            }
Step 5.	Create object and send array to sort.
a.	int out[]=ob.sort(arg); 
Step 6.	Replacing them the original array,
a.	for(inti=0;i<a.length;i++)
b.	            {
c.	for(int j=0;j<a[0].length;j++)
d.	                {
e.	                    if(i!=0&&j!=0&&i!=(a.length-1)&&j!=(a[0].length-1))
f.	                        a[i][j]=arg[point++];/**Replacing them in the original array*/    
g.	                }
h.	            }
Step 7.	Print final array
Step 8.	We run two loops from with counters i and j, where is i==j or i+j==length of array-1, we print and then add.
a.	for(inti=0;i<a.length;i++)/**Printing and calculating sum of diagonal elements*/
b.	     {for(int j=0;j<a[0].length;j++)
c.	         {
d.	             if((i==j)||(i+j==(a.length-1)))
e.	             {
f.	System.out.print(a[i][j]+ "\t");
g.	                 sum+=a[i][j];
h.	             }
              else
i.	System.out.print(" "+ "\t");
j.	         }
k.	System.out.println();
l.	     }
Step 9.	Print sum of elements
Step 10.	Stop.
*/
//code:
import java.io.*;
class Matrix_18
{
int[] sort(int[] r)/**Sorting the elements in ascending order by selection sort*/
    {
int n=r.length;
for(inti=0;i<n-1;i++)/**No of passes*/
        {
int min=i;
for(int j=i+1;j<n;j++)/**Selecting the minimum element to switch*/
            {
                if(r[j]<r[min])
                    min=j;    
            }
int t=r[i];
            r[i]=r[min];
            r[min]=t;
        }
        return r;
    }

    /**end of sort()*/
    public static void main(String args[])throws IOException
    {
BufferedReaderbr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of the DD array(Should be more than 3): ");
int n=Integer.parseInt(br.readLine());
        if(n>=4)
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
for(inti=0;i<a.length;i++)
            {
for(int j=0;j<a[0].length;j++)
                {
System.out.print(a[i][j]+ "\t");
                }
System.out.println();
            }
int[] arg=new int[(a.length-2)*(a[0].length-2)];/**To store non-boundary elements to be arranged*/
int point=0;
for(inti=0;i<a.length;i++)/**Extracting non-boundary elements*/
            {
for(int j=0;j<a[0].length;j++)
                {
                    if(i!=0&&j!=0&&i!=(a.length-1)&&j!=(a[0].length-1))
arg[point++]=a[i][j];    
                }
            }
            Matrix_18 ob= new Matrix_18();
int out[]=ob.sort(arg);/**Sorting non-boundary elements*/
            point=0;
for(inti=0;i<a.length;i++)
            {
for(int j=0;j<a[0].length;j++)
                {
                    if(i!=0&&j!=0&&i!=(a.length-1)&&j!=(a[0].length-1))
                        a[i][j]=arg[point++];/**Replacing them in the original array*/    
                }
            }
System.out.println("Final Array:- ");
for(inti=0;i<a.length;i++)/**Output*/
            {
for(int j=0;j<a[0].length;j++)
                {
System.out.print(a[i][j]+ "\t");
                }
System.out.println();
            }
System.out.println("Diagonal Elements:- ");
int sum=0;
for(inti=0;i<a.length;i++)/**Printing and calculating sum of diagonal elements*/
            {
for(int j=0;j<a[0].length;j++)
                {
                    if((i==j)||(i+j==(a.length-1)))
                    {
System.out.print(a[i][j]+ "\t");
                        sum+=a[i][j];
                    }
                    else
System.out.print(" "+ "\t");
                }
System.out.println();
            }
System.out.println("Sum of diagonal elements: "+sum);
        }
        else
System.out.println("Error! Input should be more than equal to 4!");
    }/**end of main()*/
}/**end of class*/
