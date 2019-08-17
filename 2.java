//@Author:Biparnak Roy
/*
Question:
A Smith Number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding1). The few such numbers are  4, 22, 27, 58, 85, 94, 121…………………
Examples:
1.	666
Prime factors are 2, 3, 3 and 37
Sume of the digits are(6+6+6) =18
Sum of the digits of the factors (2+3+3+(3+7))=18
2.	4937775
Prime factors are 3, 5, 5, 65837
Sum of the digits are (4+9+3+7+7+7+5) = 42
Sum of the digits of the prime factors (3+5+5+(6+5+8+3+7)) = 42
Write a program to input a number and display whether the number is a Smith Number or not
Sample Data:
Input 		94	Output		SMITH Number
Input 		102 	Output 	NOT SIMITH Number
Input 		666	Output		SMITH Number
Input 		999 	Output		NOT SMITH Number
*/
/* Algorithm:
Main():
 Step1: Start
Step2:  take the number to check  from the user and store it in int n
Step3: create variables int i, int copy, and int s and set i=2, copy=n, and s=0
Step4: [fact() is a function the returns the sum of the digits of the number] 
        while n>1 go on performing the following steps (performing prime factorisation)
	{if i is a factor of n
	  then
 s=s+fact(i)
n=n/i
	else
	   i=i+1}
Step5: if s= fact(copy)
	  Then print “the number is a smith number”
	Else
	  Print “the number is not a smith numer”
Step6: end main
 fact(int x):
Step1: start 
Step2: receive the parameter and store it in int x
Step3: create the variables int copy and int sum, and declare them as copy=x, sum=0
Step4: while copy≠0 go on performing the following steps
	{Sum=sum+ (remainder of copy/10 i.e last digit)
	Copy=copy/10 (taking away the last digit from the original number)}
Step5: return sum
Step6: end 

*/
//code:
import java.io.*;
class XI_2
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER A NUMBER TO CHECK WHETHER IT'S A SIMTH NO. OR NOT");
        int n=Integer.parseInt(in.readLine());
        int i=2,copy=n,s=0;
        while(n>1)//prime factorisation
        {
            if(n%i == 0)
            {
                s=s+fact(i);
                n=n/i;
            }
            else
                i++;
        }
        if(s==fact(copy))
        p.println("the number is a smith number");
        else
        p.println("the number is not a smith number");
    }
    static int fact(int x)//summation of digits
    {
        int copy=x,sum=0;
        while(copy!=0)
        {
           sum+=copy%10;
            copy=copy/10;
        }
        return(sum);
    }
}

        
        
    
    
