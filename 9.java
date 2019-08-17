/*
Question:
Write a program to accept a sentence which may be terminated by either ‘.’ Or ‘?’ only. The words are to be separated by a single blank space. Print an error message if the input does not terminate with ‘.’ Or ‘?’. You can assume that no word in the sentence exceeds 15 characters, so that you get a proper formatted output. Perform the following tasks:  
i)	Convert the first letter of each word to uppercase. 
ii)	Find the number of vowels and consonants in each word and display them with proper heading along with the words. Test your program with the following inputs:
Example 1  
INPUT : Intelligence plus character is education.  
OUTPUT:  
Intelligence plus character is education.
Word  		    Vowels  	Consonants 
Intelligence  	      5  	   7 
Plus   	              1  	   3 
Character     	      3  	   6 
Is   	              1     	   1 
Education  	      5  	   4
Example 2  
INPUT : God is great.  
OUTPUT:  
God is great
Word  		Vowels      Consonants 
God   	   	  1  	       2 
Is   		  1  	       1 
Great   	  2  	       3
*/
/*
Algorithm:
main():
Step1: Start
Step2: take the string as input from the user and store it in string s
Step3:  if the last word of s is not  ‘.’, ’.’, ’?’, and ’!’ then 
	    Print “INVALID INPUT”
	    End
	Else
	   Goto step4
Step4: print "WORDS               "+" Vowels            Consonants"
Step5:  remove all the spaces from the string s and store its words in an array 
	String arr []= s.split(" ")
Step6: fop int i=0 to i= length of arr[] perform the following steps
	{
		int l=length of the word at ith position of arr[]
		conver the 1st letter of the word at ith position of arr[] to uppercase
		int v = vowels(arr[i]) (counting the number of vowels)
		p.print “arr[i]+"             "+" "+v+"      "+(l-v)”
	}
Step7: end
Vowels(String x):  
 Step1: Start
Step2: Store the parameter in  string x
Step3: int l1= length of string x
Step4:  for int i=0 till i>l1 continue the following steps
		If the character at ith position of the string x is a vowel then
			int count =count+1
Step5: return count
Step6: end
*/
//code
import java.io.*;
class XI_9
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER THE SENTENCE");
        String s=in.readLine();
        if(s.charAt(s.length()-1)!='.'&&s.charAt(s.length()-1)!='?')
        {      p.println("INVALID INPUT");
            System.exit(0);
        }         
        int i;
        s.trim();
        String arr []= s.split(" ");
        p.println("WORDS\t\t\t\t\t"+" Vowels\t\tConsonants" );
        for(i=0;i<arr.length;i++)
        {
            int l=arr[i].length();
            arr[i]=Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1,arr[i].length());
            int v=vowels(arr[i]);
            p.println(arr[i]+"\t\t\t\t\t"+" "+v+"\t\t"+(l-v));
        }
    }
      static int vowels(String x)
    {
        int l1=x.length(),i=0,count=0;
        for(i=0;i<l1;i++)
        {
            if(x.charAt(i)=='A'||x.charAt(i)=='E'||x.charAt(i)=='I'||x.charAt(i)=='O'||x.charAt(i)=='U'||x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
                count++;
        }
        return(count);
    }
}

