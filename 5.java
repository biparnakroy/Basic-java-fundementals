/*
Question:
Write a Program in Java to input a number and check whether it is a Pronic Number or Hetermecic Number, or not.
Pronic Number: A pronic number, oblong number, rectangular number or hetermecic number is a number which the product of two consecutive integers, that is, n(n+1).
The first few pronic numbers are:
0, 2, 6 ,12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182……… etc.
*/
/*
Algorithm:
Step1: Start
Step2:  take the number to perform check from the user and store it in int n
Step3: declare int count, and  int i, and initialize count count=0
Step4: for i=1 to i=n-1 perform the following steps
	If n= i x (i+1) then 
	   Count =count+1
Step5: If count>0 or n=0
	   Print "THE NUMBER IS A PRONIC NUMBER"
	Else
	   Print "THE NUMBER IS NOT A PRONIC NUMBER"
Step6: end
*/
//code:
import java.io.*;
class XI_5
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER A NUMBER TO CHECK WHETHER IT'S A PRONIC NUMBER OR NOT");
        int n =Integer.parseInt(in.readLine());
        int i,count=0;
        for(i=1;i<n;i++)
        {
            if(i*(i+1)==n)
            {   count++;
            }
        }
        if(count>0 ||n==0)
        p.println("THE NUMBER IS A PRONIC NUMBER");
        else
        p.println("THE NUMBER IS NOT A PRONIC NUMBER");
    }
}
