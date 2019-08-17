//@Author:Dungeon_Master
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
        while(n>1)
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
    static int fact(int x)
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

        
        
    
    
