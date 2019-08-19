/*
question:
Write a program to accept a sentence which may be terminated by either ‘.’, ‘?’ or ‘!’ only. Any other character may be ignored. The words may be separated by more than one blank space and are in UPPER CASE. Perform the following tasks: 
      Accept a sentence andreduce all the extra blank space between 2 words to a single blank space. 
      Accept a word from the user which is a part of the sentence along with its position number and delete the word and display the sentence. 
Test your program for the following data and some random data:
Example 1 
INPUT: A     MORNING WALK IS A BLESSING FOR    THE     WHOLE DAY. 
WORD TO BE DELETED :  IS 
WORD POSITION IN THE SENTENCE : 6 
OUTPUT: A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.
Example 2 
INPUT: AS  YOU     SOW, SO    SO YOU REAP. 
WORD TO BE DELETED :  SO 
WORD POSITION IN THE SENTENCE : 4 
OUTPUT: AS YOU SOW, SO YOU REAP.
Example 3 
INPUT: STUDY WELL ##. 
OUTPUT: INVALID INPUT.
*/
/*
Algorith,:
Main()
Step 1.	Start
Step 2.	Initialize BufferedReaderand Scanner class and initialise variables, take input according to conditions, and convert to Uppercase
Step 3.	Using ternary operator and a loop running from 0 to length-1, check if character is a letter or digit or a white space
a.	check=(Character.isLetterOrDigit(str.charAt(i))||Character.isWhitespace(str.charAt(i)))?check:false
Step 4.	Enter if construct if check is true and the sentence is ending with ‘.’, ‘?’ or ‘!’, or else appropriate error messages are printed
Step 5.	Keep str null, as loop is entered which runs to input and store more words
Step 6.	str is trimmed and then split and stored in array
a.	str=str.trim();
b.	String arr[]=str.split(" ");
Step 7.	Word to be deleted is input from user then converted to uppercase, and position is also input
Step 8.	If position-1 is less than the length and element at that position is equal to the word to be deleted, then the word is deleted
a.	if(((pos-1)<arr.length)&&arr[pos-1].equals(ele))
b.	{
for(inti=0;i<arr.length;i++)
c.	     {   
d.	        if(i==(pos-1))
e.	arr[i]=null;
f.	     }
g.	 }
h.	 else
i.	System.out.println("The position and the word are not matching!");
Step 9.	str is filled up with the remaining words, and then printed
Step 10.	Stop
*/
//code:
import java.util.*;
import java.io.*;
class DeleteWord_24
{
    public static void main(String args[])throws IOException
    {
BufferedReaderbr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the sentence ending with '.' or '?' or '!' only::");
        String str=br.readLine().toUpperCase();
        Scanner sc=new Scanner(str);/**Scanner is used to easily break up the string into tokens seperated by whitespaces*/
boolean check=true;
for(inti=0;i<str.length()-1;i++)/**Checking that the sentence does not contain any special characters*/
            check=(Character.isLetterOrDigit(str.charAt(i))==true||Character.isWhitespace(str.charAt(i))==true)?check:false;   
        if(check==true&&(str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='?'||str.charAt(str.length()-1)=='!'))/**Boundary conditions*/
        {
str="";
            while(sc.hasNext())/**Concatenating the tokens back to the string with a single space between words*/
            {
str+=sc.next()+" "; 
            }
str=str.trim();
            String arr[]=str.split(" ");/**Splitting the sentence into array of words*/
System.out.print("Enter word to be deleted::");
            String ele=br.readLine().toUpperCase();
System.out.print("Position of the word to be deleted in the sentence::");
intpos=Integer.parseInt(br.readLine());
            if(((pos-1)<arr.length)&&arr[pos-1].equals(ele))/**Matching user's input word with its position in the sentence*/
            {
for(inti=0;i<arr.length;i++)
                {
                    if(i==(pos-1))/**Deleting word from array if found*/
arr[i]=null;
                }
            }
            else
System.out.println("The position and the word are not matching!");
str="";
for(inti=0;i<arr.length;i++)
            {
                if(arr[i]!=null)/**Concatenating back the array to form the output sentence*/
str+=arr[i]+" ";
            }
str=str.trim();
System.out.println("Output::"+str);
        }
        else if(check==false)
System.out.println("INVALID INPUT!");
        else
System.out.println("INVALID INPUT! The sentence should end in '.' or '?' or'!'");
    }/**end of main*/
}/**end of class*/
