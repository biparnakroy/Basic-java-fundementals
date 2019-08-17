/*
Question:
Write a program in java to input a number and check whether it is a Fascinating Number or not
Fascinating Numbers: Some numbers of or more exhibit a very interesting property. The property is such that, when the number is multiplied by 2 and 3, and both these products concatenated with the original number, all the digits from 1 to 9 are present exactly once, regardless of the number of zeros.
Lets understand the concept of Fascinations Numbers though the following examples:
Consider the number 192
192		x		1		=		192
192		x		2		=		384
192		x		3		=		576
Concatenating the results: 192384567
It could be observed that ‘192384576’ consists of all the digits form 1 to 9 exactly once, hence it could be concluded that the number is a fascinating number.
Some of the example are: 192, 219, 273, 327, 1920, 1920, 2019 etc.
*/
/*
Algorithm:
Step1: Start
Step2:  take the number to perform check from the user and store it in int n
Step3: declare String s=Integer.toString(n*1)+Integer.toString(n*2)+Integer.toString(n*3), int c=0 
Step4: for i=0 to i= length of sting s -1 perform the following steps.
{ 
Char ch = character at ith position of string s
If   ch='1' or ch='2' or ch='3' or h='4' or ch='5' or ch='6' or ch='7' or ch='8' or ch='9'  then 
		C=c+1
}
Step5: if c=9 then 
	 Print "THE NUMBER IS A FASCINATING NUMBER"
	Else
	 print "THE NUMBER IS NOT A FASCINATING NUMBER"
Step6: end
*/
//Code:
Source code:
import java.io.*;
import java.util.Arrays;
class XI_7
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER A NUMBER TO CHECK WHETHER IT'S A FASCINATING NUMBER OR NOT");
        int n=Integer.parseInt(in.readLine()), c=0;
        String s=Integer.toString(n*1)+Integer.toString(n*2)+Integer.toString(n*3);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
            c++;
        }
        if(c==9)
        p.println("THE NUMBER IS A FASCINATING NUMBER");
        else
        p.println("THE NUMBER IS NOT A FASCINATING NUMBER");
    }
}
