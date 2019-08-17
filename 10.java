/*
Question:
Write a program in JAVA to accept a sentence and sort the words in the sentence according o the number of vowels in each word. Use any sorting technique. Words with minimum  vowels comes at first.
SAMPLEINPUT:
INPUT: apple is a tasty fruit.
OUTPUT: is a apple fruit.
INPUT: pineapple is my favourite fruit
OUTPUT: my is fruit pineapple favourite
*/
/*
Algorithm:
Step1: start
Step2: take the string as input from the user and store it in String s
Step3: create an array storing  the words of the string s
	String m[]=s.split(" ");
	Create another array of same size to store the no. of vowels in each word
	String m1[]=s.split(" ");
Step5: for int i=0 i < length of m[]
	m1[]= vowels(m[i]) [no of vowels of the word at ith position ]
Step6: sorting m1[] in ascending ordere
	for(i=0;i<m1.length-1;i++)
        {
            for(j=0;j<(m1.length-1-i);j++)
            {
                if(m1[j]>m1[j+1])
                {
                    t=m1[j];
                    m1[j]=m1[j+1];
                    m1[j+1]=t;
                    t1=m[j]; (shifting the words accordingly)
                    m[j]=m[j+1];
                    m[j+1]=t1;
                 }
            }
        }
Step 7: printing m[]
Step8: end
Vowels(String x):
Step1: start
Step2: Store the parameter in String x, and declear int l1=length of x,int i=0, int count=0
Step3: for i=0 to i< l1
	If the charceter at ith position is vowel 
	Cout=cont+1
Step4: return count
Step5: end
*/
//code:
import java.io.*;
class XI_10
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER THE SENTENCE");
        String s=in.readLine(),t1;
        String m[]=s.split(" ");
        int m1[]=new int[m.length];
        int i=0,j=0,t=0;
        for(i=0;i<m.length;i++)
        {
            m1[i]=vowels(m[i]);
        }
          for(i=0;i<m1.length-1;i++)
        {
            for(j=0;j<(m1.length-1-i);j++)
            {
                if(m1[j]>m1[j+1])
                {
                    t=m1[j];
                    m1[j]=m1[j+1];
                    m1[j+1]=t;
                    t1=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t1;
                 }
            }
        } x
        for(i=0;i<m.length;i++)
        {
            System.out.print(m[i]+" ");
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
