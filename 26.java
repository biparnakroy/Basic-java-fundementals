/*
Question:
Caesar Cipher is an encryption technique which is implemented as ROT13 (‘rotate by 13 places’).
It is a simple letter substitution cipher that replaces a letter with the letter 13 places after it in the alphabets, 
with the other characters remaining unchanged.

| A/a | B/b | C/c | D/d | E/e | F/f | G/g | H/h | I/i | J/j | K/k | L/l | M/m |
  ^      ^     ^     ^     ^     ^     ^     ^     ^     ^     ^     ^     ^   
  |      |     |     |     |     |     |     |     |     |     |     |     |
  v      v     v     v     v     v     v     v     v     v     v     v     v
| N/n | O/o | P/p | Q/q | R/r | S/s | T/t | U/u | V/v | W/w | X/x | Y/y | Z/z |


Write a program to accept a plain text of length L, where L must be greater than 3 and less than 100.
Encrypt the text if valid as per the Caesar Cipher.
Test your program with the sample data and some random data:
Example 1
INPUT : Hello! How are you?
OUTPUT : The cipher text is:
Uryyb? Ubj ner lbh?

Example 2
INPUT : Encryption helps to secure data.
OUTPUT : The cipher text is:
Rapelcgvba urycf gb frpher qngn.

Example 3
INPUT : You
OUTPUT : INVALID LENGTH
*/
/* Algorithm:
Main()
Step 1.	Start
Step 2.	Initialize BufferedReader, take input and initialize variables
Step 3.	If the input is correct, enter if-else construct, else print error message
Step 4.	Run loop from 0 to length and store character from string in different variable and check if char is a letter of not. If yes, proceed, else ch is added to cipher output
Step 5.	The cipher is created in the ternary operator where the char is checked for being uppercase and in+13 >90 or char is in lowercase and in+13<122.
a.	
b.	in=((Character.isUpperCase(ch)&&(in+13)>90)||(Character.isLowerCase(ch)&&(in+13)>122))?((Character.isUpperCase(ch))?(64+((in+13)%90)):(96+((in+13)%122))):(in+13);
c.	
d.	out+=(char)(in);
Step 6.	Print cipher
Stop7 : end
*/
//code:
import java.io.*;
class Cipher_28
{
    public static void main(String args[])throws IOException
    {	
BufferedReaderbr=new BufferedReader(new InputStreamReader(System.in));   
System.out.println("Enter the sentence of strength 4-100 letters(including the spaces): ");
        String str=br.readLine(),out="";
        if(str.length()>=4&&str.length()<=100)
        {
for(inti=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(Character.isLetter(ch))
                {
int in=(int)ch;
                    in=((Character.isUpperCase(ch)&&(in+13)>90)||(Character.isLowerCase(ch)&&(in+13)>122))?((Character.isUpperCase(ch))?(64+((in+13)%90)):(96+((in+13)%122))):(in+13);
                    out+=(char)(in);
                }
                else
                    out+=ch;
            }
System.out.println("The cipher text is: "+out);
        }
        else
System.out.println("INVALID LENGTH!");
    }
}
