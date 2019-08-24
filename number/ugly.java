/*
 Write a Java program to check whether a given number is an ugly number. Go to the editor
In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. 
First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included. 
Test Date:Input an integer number: 235 
Expected Output :
It is not an ugly number.
*/
import java.io.*;
class ugly
{
    public static void main(String args[])throws IOException
    {
        try
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in =new BufferedReader(read);
            System.out.println("ENTER THE NUMBER");
            int n=Integer.parseInt(in.readLine());
            int copy=n,check=0;
            String fact="";
            for (int i =2;i<=copy;i++)
            {
                if(copy%i==0)
                {
                    fact+=Integer.toString(i);
                    copy/=i;
                }
            }
            for(int i=0;i<fact.length();i++)
            {
                if(fact.charAt(i)!='2' && fact.charAt(i)!='3' && fact.charAt(i)!='5')
                {
                    System.out.println("THE NUMBER IS NOT UGLY");
                    check=1;
                    break;
                }
            }
            if(check==0)
            {
                System.out.println("THE NUMBER IS UGLY");
            }
        }
        catch( Exception e){}
    }
}
