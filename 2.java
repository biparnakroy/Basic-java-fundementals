//@Author:Biparnak Roy
//Smith number
//A Smith number is a composite number for which,
//in a given base (in base 10 by default), the sum of its digits is equal to the sum of the digits in its prime factorization.
import java.io.*;
class XI_2
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER A NUMBER TO CHECK WHETHER IT'S A SIMTH NO. OR NOT");
        int n=Integer.parseInt(in.readLine());
        int i=2,copy=n,s=0;
        while(n>1)//prime factorisation
        {
            if(n%i == 0)
            {
                s=s+fact(i);
                n=n/i;
            }
            else
                i++;
        }
        if(s==fact(copy))
        p.println("the number is a smith number");
        else
        p.println("the number is not a smith number");
    }
    static int fact(int x)//summation of digits
    {
        int copy=x,sum=0;
        while(copy!=0)
        {
           sum+=copy%10;
            copy=copy/10;
        }
        return(sum);
    }
}

        
        
    
    
