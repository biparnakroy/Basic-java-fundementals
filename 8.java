/*
Questions:
A Circular Prime is a prime number that remains prime under cyclic shifts of its digits. When the leftmost digit is removed and replaced at the end of the remaining string of digits, the generated number is still prime. The process is repeated until the original number is reached again. A number is said to be prime if it has only two factors 1 and itself.
Example:	131
311 
113 
Hence 131 is circular prime Accept a positive number N and check whether it is circular prime or not. The new numbers formed after the shifting of the digits should also be displayed. Test your program with the following data and some random data:
Example 1 
INPUT :		N= 197
OUTPUT: 	197 
971
 719
 197 IS A CIRCULAR PRIME
Example 2
 INPUT: 		N=1193 
OUTPUT:	 1193
 1931
 9311
 3119 
 1193 IS A CIRCULAR PRIME
Example 3 
INPUT: 		29 
OUTPUT: 	29 
92 
29 IS NOT A CIRCULAR PRIME
*/
/*
Algorithm:
main():
Step1: start 
Step2: take the number to perform check on from the user as String n	
Step3: create an array of string String m[]=new String[n.length()] , String copy, int count=0 and set m[0]=n
Step4: for i=0 to i= length of s-1 perform the following steps
	    Copy= copy+ ( string s from the 1st position) + the character at 1st position of s
	    m[i]=copy (storing all the permutations in an array)
Step5:  for i=0 to i= length of m-1 perform the following steps
	   	If   prime(m[i]) is false (i.e.  m[i] is not a prime number) then 
		     Count=count +1;
Step6: if count =0 then
	   Print "THE NUMBER IS A CIRCULAR PRIME"
	Else
	  Print "THE NUMBER IS NOT A CIRCULAR PRIME"
Step7: end
boolean prime(int x):
Step1: Start
Step2: store the parameter is int x , declear int i=0, a=0
Step3: for i=2 to i<x perform the following the steps
	   If remainder of x/i is 0 then
	      a=a+1
Step4: if a≠0	
	    Return false
	Else
	   Return true
Step5: end
*/
//code
 import java.io.*;
class XI_8
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER A NUMBER TO CHECK WHETHER IT'S A CIRCULATING NUMBER OR NOT");
        String n=in.readLine();
        String m[]=new String[n.length()];
        m[0]=n;String copy=n;int count=0;
        for(int i=1;i<n.length();i++)
        {
            copy=copy.substring(1)+ copy.charAt(0);
            m[i]=copy;
        }
        for(int i=0;i<n.length();i++)
        {
            if(prime(Integer.parseInt(m[i]))!= true)
            count++;
        }
        if(count ==0)
        p.println("THE NUMBER IS A CIRCULAR PRIME");
        else
        p.println("THE NUMBER IS NOT A CIRCULAR PRIME");
    }
    static boolean prime(int x)
    {
        int i=0,a=0;
        for(i=2;i<x;i++)
        {
            if(x%i==0)
            a++;
        }
        if(a!=0)
        return(false);
        else
        return(true);
    }
}
