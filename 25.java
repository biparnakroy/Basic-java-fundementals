/* Question:
A company manufactures packing cartons in four sizes, i.e. cartons to accommodate 6 boxes, 12 boxes, 24 boxes and 48 boxes. Design a program to accept the number of boxes to be packed (N) by the user (maximum up to 1000 boxes) and display the break-up of the cartons used in descending order of capacity (i.e. preference should be given to the highest capacity available, and if boxes left are less than 6, an extra carton of capacity 6 should be used.)
Test your program with the sample data and some random data:

Example 1
INPUT : N = 726
OUTPUT :
48x15=720
6x1=	6
Remaining   boxes = 0
Total number of boxes = 726
Total number of cartons = 16

Example 2
INPUT : N = 140
OUTPUT :
48 X 2 = 96
24 x 1 = 24
12 x 1 = 12
6 x 1 = 6
Remaining boxes 2 x 1 = 2
Total number of boxes = 140
Total number of cartons = 6

Example 3
INPUT : N = 4296
OUTPUT : INVALID LENGTH
*/
/*
Algorithm:
Main()
Step 1.	Start
Step 2.	Initialize BufferedReader, initialize variables and take input
Step 3.	Enter if construct and then initialize car[] and q[], point copy and tot, or print error message
Step 4.	Enter loop running when copy>=6, fill q, and update tot and copy
a.	while(copy>=6)
b.	{
c.	    q[point]=copy/car[point];
d.	    tot+=copy/car[point];
e.	    copy=copy%car[point++];
f.	}
Step 5.	Enter loop construct running from 0 to length of array, and then print output
a.	if(q[i]>0)
b.	System.out.println(car[i]+"\tX\t"+q[i]+"= "+(car[i]*q[i])); 
Step 6.	If copy>0, print number of remaining boxes
Step 7.	Print number of boxes and cartons
Step 8.	Stop.
*/
//code:
import java.io.*;
class Company_27
{
    public static void main(String args[])throws IOException
    {
BufferedReaderbr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no.of boxes to pack(<=1000): ");
int n=Integer.parseInt(br.readLine());
        if(n<=1000)
        {
intcar[]={48,24,12,6};
intq[]=new int[(car.length)];
int point=0,tot=0;;
int copy=n;
            while(copy>=6)
            {
                q[point]=copy/car[point];
                tot+=copy/car[point];
                copy=copy%car[point++];
            }
for(inti=0;i<q.length;i++)
            {
                if(q[i]>0)
System.out.println(car[i]+"\tX\t"+q[i]+"= "+(car[i]*q[i]));
            }
            if(copy>0)
System.out.println("No.of remaining boxes: "+copy);
System.out.println("Total no.of boxes: "+n);
System.out.println("Total no.of cartons: "+((copy>0)?tot+1:tot));
        }
        else
System.out.println("INVALID LENGTH!");
    }
}
