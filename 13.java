/* Question: MAGIC_SQUARE
Write a program to enter an integer number ‘N’. Create a magic square of size ‘N*N’. Finally, print the 
elements of the matrix as Magic Square. 
A square matrix is said to be a Magic Square, if the sum of each row, each column and each diagonal is same.
*/
/* algorithm:
Step 1.	Start
Step 2.	Accept size of array ‘n’ from user and generate a double dimensional array of size ‘n*n’
Step 3.	Accept values for array from the user
Step 4.	Calculate sum of rows, columns and diagonals of the array
a.	for(j=0;j<n;j++
b.	 {
c.	sumr+=arr[i][j];
d.	sumc+=arr[j][i];
e.	    if(i==j)
f.	sumld+=arr[i][j];
g.	    if((i+j)==(n-1))
h.	sumrd+=arr[i][j];
i.	 }
j.	 if(sumr==sumc)
k.	    f=1;
l.	 else
m.	 {
n.	    f=0;
o.	    break;
p.	
Step 5.	Check if they are equal
a.	if(sumld==sumrd&&sumld==sumc&& f==1)
b.	System.out.println("Magic Square");
c.	 else
d.	System.out.println("Not a Magic Square");
Step 6.	If true display “Magic Square” else display “Not a Magic Square”
Step 7.	Stop.
*/
// Code:
import java.util.*;
class Magic_sq
{
    public static void main()
    {
intn,i,j,sumld=0,sumrd=0;
        Scanner in = new Scanner(System.in);
System.out.println("Enter array size");
        n=in.nextInt();
intarr[][]=new int [n][n];
int f=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
System.out.print("Enter a number : ");
arr[i][j]=in.nextInt();
            }
        }
intsumr=0,sumc=0;
        for(i=0;i<n;i++)
        {
sumr=0;
sumc=0;
            for(j=0;j<n;j++)
            {
sumr+=arr[i][j];
sumc+=arr[j][i];
                if(i==j)
sumld+=arr[i][j];
                if((i+j)==(n-1))
sumrd+=arr[i][j];
            }
            if(sumr==sumc)
                f=1;
            else
            {
                f=0;
                break;
            }
        }
if(sumld==sumrd&&sumld==sumc&& f==1)
System.out.println("Magic Square");
        else
System.out.println("Not a Magic Square");
    }
}
