/* Question:
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
import java.io.*;
class XII_16
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("m=");int i,j=0,k;
        int m=Integer.parseInt(in.readLine());
        System.out.println("n=");
        int n=Integer.parseInt(in.readLine());
        for(i=m;i<=n;i++)
        {
            if(magic(i)==true&& composite(i)==true)
            {System.out.print(i+",");
                j++;
            }
        }
        System.out.println("\nTHE FREQUENCY OF THE MAGIC INTEGERS IS="+j);
    }
    static boolean magic(int n)
    {
        int x=n;
        int s=0;
        s=x;int rmd;
        while(s>9)
        {
            x=s;s=0;
            while(x!=0)
            {
                rmd=x%10;
                s+=rmd;
                x/=10;
            }
        }
        if(s==1)
        {
            return (true);
        }
        else
            return( false);
    }
    static boolean composite( int n)
    {
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                return(true);
         }
         return(false);
    }
}
