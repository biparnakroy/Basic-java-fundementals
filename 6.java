/*
Question:
Write a program in java to input a number and check whether it is a Harshad number or Niven number or not.
Harshad Number: In recreational mathematics a Harshad number(or Niven Number), is an integer that is divisible by the sum of its digits. 
Let ‘s understand the concept of harshad number through the following examples:
The number 18 is a Harshad Number in base 10, because the sum of the digits 1 and 8 is 9(1+9) and 18 is divisible by 9 (since 18%9=0)
The number 1729 is a Harshad Number in base 10, because the sum of the digits 1, 7, 2, and 9  is 19(1+7+2+9=19) and 1729 is divisible by 19 (since 1729=19*91)
The number 19 is a Harshad Number in base 10, because the sum of the digits 1, and 9 is 10(1+9=10) and 19 is not divisible by 10 (since 19%10=9)
First few Harshad numbers in base 10 are:
1,2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, 27, 30, 36, ……. Etc
*/
/*
Algorithm:
Step1: Start
Step2:  take the number to perform check from the user and store it in int n
Step3: declare int copy, and  int s, and initialize copy and s as copy=n, s=0
Step4: while copy ≠0 perform the following steps
	    s=s+ remainder of copy/10 (last digit)
	   copy=copy/10 (removing the last digit from the original no.) 
Step5: if the remainder of n/s is 0 then
	  Print “THE NUMBER IS A NIVEN NUMBER"
	Else
	  Print “THE NUMBER IS NOT A NNIVEN NUMBER"
Step6: end
*/
//code:
import java.io.*;
class XI_6
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER A NUMBER TO CHECK WHETHER IT'S A NIVEN NUMBER OR NOT");
        int n=Integer.parseInt(in.readLine());
        int copy=n,s=0;
        while(copy!=0)
        {
            s+=copy%10;
            copy/=10;
        }
        if(n%s==0)
        p.println("THE NUMBER IS A NIVEN NUMBER");
        else
        p.println("THE NUMBER IS NOT A NIVEN NUMBER");
    }
}
