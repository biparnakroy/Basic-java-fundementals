/* Question:
Write a program to accept a sentence which may be terminated by either '.', '?' or '!' only. The words may be separated by more than one blank space and are in UPPER CASE. Perform the following tasks: 
a) Find the number of words beginning an ending with a vowel. 
b) Place the words which begin and with a vowel at the beginning, followed by the remaining words as they occur in the sentence. Test your program with the sample data and some random data:
Example 1 	
INPUT : 		ANAMIKA AND SUSAN ARE NEVER GOING TO QUARREL ANYMORE. 
OUTPUT:	 NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = 3 
ANAMIKA ARE ANYMORE AND SUSAN NEVER GOING TO QUARREL
Example 2 
INPUT : 		YOU MUST AIM TO BE A BETTER PERSON TOMORROW THAN YOU ARE TODAY. 
OUTPUT: 	NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = 2 
A ARE YOU MUST AIM TO BE BETTER PERSON TOMMORROW THAN YOU
Example 3 
INPUT : 		LOOK BEFORE YOU LEAP. 
OUTPUT:	NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = 2 
A ARE YOU MUST AIM TO BE BETTER PERSON TOMORROW THAN YOU TODAY 
Example 4 
INPUT : 		HOW ARE YOU@ 
OUTPUT: 	INVALID INPUT
*/
/* Algorithm:
Main()
Step 1.	Start
Step 2.	Initialize BufferedReader, and take input, then convert to upper case
Step 3.	If input is correct according to parameters mentioned, then the control goes into an if-else construct, the sentence is extracted and then split into an array
a.	if(str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='?'||str.charAt(str.length()-1)=='!')
b.	{
c.	str=str.substring(0,str.length()-1);
d.	String arr[]=str.split(" ");
Step 4.	Initialize new array and counter, run loop from 0 to the length and store elements in array
a.	for(inti=0;i<arr.length;i++)
b.	{
c.	    char ch=arr[i].charAt(0);
d.	    char chl=arr[i].charAt(arr[i].length()-1);
e.	                if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&(chl=='A'||chl=='E'||chl=='I'||chl=='O'||chl=='U'))
f.	     {
g.	vowcount++;
h.	         arr2[point++]=arr[i];
i.	arr[i]=null;
j.	     }
k.	}
Step 5.	Store output in str from the array
Step 6.	for(inti=0;i<arr2.length;i++)
a.	{
b.	    if(arr2[i]!=null)
c.	      out+=arr2[i]+" ";
d.	}
e.	for(inti=0;i<arr.length;i++)
f.	{
g.	    if(arr[i]!=null)
h.	    out+=arr[i]+" ";
i.	}
Step 7.	Print.
Step 8.	Stop
*/
//code:
import java.io.*;
class Vowel_19
{
    public static void main(String args[])throws IOException
    {
BufferedReaderbr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the sentence ending with '.' or '?' or '!' only: ");
        String str=br.readLine().toUpperCase();
        if(str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='?'||str.charAt(str.length()-1)=='!')/**Checking for the last character in the sentence*/
        {
str=str.substring(0,str.length()-1);
            String arr[]=str.split(" ");/**This command splits the string into an array of the words*/
intvowcount=0,point=0;
            String arr2[]=new String[arr.length];/**This array temporarily stores the words with vowel beginning and ending*/
for(inti=0;i<arr.length;i++)
            {
                char ch=arr[i].charAt(0);
                char chl=arr[i].charAt(arr[i].length()-1);
                if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&(chl=='A'||chl=='E'||chl=='I'||chl=='O'||chl=='U'))/**Checking for the first and last letter of each word*/
                {
vowcount++;
                    arr2[point++]=arr[i];/**This command stores the first words and deletes those from the original array*/
arr[i]=null;
                }
            }
            String out="";/**Both arrays are recombined below to give the output sentence*/
for(inti=0;i<arr2.length;i++)
            {
                if(arr2[i]!=null)
                    out+=arr2[i]+" ";
            }
for(inti=0;i<arr.length;i++)
            {
                if(arr[i]!=null)
                    out+=arr[i]+" ";
            }
System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL: "+vowcount);
System.out.println("OUTPUT: "+out);
        }
        else
System.out.println("INVALID INPUT! The sentence should end in '.' or '?' or'!'");
    }/**end of main()*/
}/**end of class*/
