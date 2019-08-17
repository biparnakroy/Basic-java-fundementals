/*
Question:
Write a program on java to input a number and check whether it is an Evil Number or not .
Evil Number: An evil number is a positive number which has even number of 1’s in it’s  binary equivalent.
Example: Binary equivalent of 9 is 1001, which contains even number of 1’s.
A few evil numbers are 3, 5, 6, 9 . . . 
Design a program to accept a positive whole number and find the binary equivalent and count the number of 1’s in it and display whether it is a Evil number or not with a appropriate mess in format given below:
Example 1
INPUT: 15
BINARY EQUIVALENT: 1111
NO. OF 1’s : 4
OUTPUT: EVIL NUMBER
Example 2
INPUT: 26
BINARY EQUIVALENT: 11010
NO. OF 1’s : 3
OUTPUT:NOT AN EVIL NUMBER
*/
/*
Alogorithm:
Step1: Start
Step2:  take the number to perform check from the user and store it in int n
Step3: declare  int copy, int rmd,  int count, int I, and String s and initialize copy and count as copy=n , count=0
Step4: while copy≠0 perform the following steps
	{
		rmd= remainder of copy/2
		s=Integer.toString(rmd)+s [converting rmd to string and concatenating]
		copy=copy/2
	}
Step5: for i<length of String s continue the following steps
	{
		If character at ith position of the string s is 1 then
		     Count=count+1
		i=i+1
	}
Step6: if the count is an even no. then
		Print “THE NUMBER IS AN EVIL NO.”
	   Else
		Print” THE NUMBER IS NOT AN EVIL NO.”
Step7: end
*/
//code
import java.io.*;
class XI_4
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER THE NUMBER TO CHECK WHETHER IT'S A EVIL NO. OR NOT");
        int n=Integer.parseInt(in.readLine());
        int copy,rmd,count=0,i;
        String s="";
        copy=n;
        while(copy!=0)
        {
            rmd=copy%2;
            s=Integer.toString(rmd)+s;
            copy/=2;
        }
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            count++;
        }
        if(count%2==0)
        p.println("THE NUMBER IS A EVIL NO.");
        else
        p.println("THE NUMBER IS A EVIL NO.");
}
}
