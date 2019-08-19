/*question:
Given two positive numbers M and N, such that M is between 100 and 10000 and N is less than 100. Find the smallest integer that is greater than M and whose digits add up to N. For example, if M=100 and N=11, then the smallest integer greater than 100 whose digits add up to 11 is 119.  
Write a program to accept the numbers M and N from the user and print the smallest required number whose sum of all its digits is equal to N. Also, print the total number of digits present in the required number. The program should check for the validity of the inputs and display an appropriate message for an invalid input.  
Test your program with some sample data and some random data:
Example 1:  
INPUT :  	M= 100    N=11  
OUTPUT:   	The required number is= 119   
Total number of digits=3
Example 2  
INPUT: 		M= 1500   N=25  
OUTPUT:   	The required number is =1699   
Total number of digits=4
Example 3  
INPUT: 		M= 99   N=11  
OUTPUT:   	INVALID INPUT 
Example 4  
INPUT: 		M= 112
		N=130  
OUTPUT:   	INVALID INPUT
*/
/* Algorithm:
Sum()
Step 1.	Start
Step 2.	Input n to calculate sum of digits, initialise variables
Step 3.	Run loop from n to 0, then add up.
a.	int d=n%10;
b.	sum+=d;
c.	n/=10;
Step 4.	Return sum
Step 5.	Stop.
Main()
Step 1.	Start
Step 2.	Initializing BufferedReader and other variables with inputs from the user, initialize new object
Step 3.	Enter is construct based on conditions specified and checking sum, else print error statement
a.	if(n<=100&&m>=100&&m<=10000&&(check<=n)
Step 4.	Running loop from m to 10000, and checking for the number which has the same number of digits as n, counting digits through loop
a.	for(inti=m;i<=10000;i++)
b.	    {
c.	         if(ob.sum(i)==n)             {
d.	System.out.println("The required number is: "+i);
e.	int c=0;
f.	         while(i!=0)/**Counting the number of digits*/
g.	         {
h.	i/=10;
i.	c++;
j.	         }
Step 5.	Print number
Step 6.	Stop
*/
//code:
import java.io.*;
class Addition_20
{
intsum(int n)/**Counting the sum of digits*/
    {
int sum=0;
        while(n!=0)
        {
int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }

    /**end of sum()*/
    public static void main(String args[])throws IOException
    {
BufferedReaderbr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("M(100-10000): ");
int m=Integer.parseInt(br.readLine());
System.out.println("N(<100): ");
int n=Integer.parseInt(br.readLine());
        Addition_20 ob=new Addition_20();
int check=ob.sum(m);
        if(n<=100&&m>=100&&m<=10000&&(check<=n))/**Boundary conditions*/
        {
for(inti=m;;i++)
            {
                if(ob.sum(i)==n)/**Checking for least number which has same sum of digits as N*/
                {
System.out.println("The required number is: "+i);
int c=0;
                    while(i!=0)/**Counting the number of digits*/
                    {
i/=10;
c++;
                    }
System.out.println("Total number of digits: "+c);
                    break;
                }
            }
        }
        else/**Error statement when conditions are not fulfilled*/
System.out.println("INVALID INPUT.");
    }/**end of main()*/
}/**end of class*/
