//@Author:Dungeon_Master
import java.io.*;
class XI_3
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER THE CHOICE\n1. TO CONVERT TO HEXADECIMAL\n2. TO CONVERT TO OCTAL\n3. TO CONVERT TO BINARY");
        int x= Integer.parseInt(in.readLine());
        p.println("ENTER THE NUMBER");
        int n= Integer.parseInt(in.readLine());
        int copy,rmd;
        String s="";
        copy=n;
        switch(x)
        {
            case 1:
            char ch[]= {'A','B','C','D','E','F','G'};
            while(copy!=0)
            {
                rmd=copy%16;
                if(rmd<=10)
                    s=Integer.toString(rmd)+s;
                else
                    s=ch[rmd-10]+s;
                copy/=16;     
            }
            p.println(s);
            break;
            case 2:
            while(copy!=0)
            {
                rmd=copy%8;
                s=Integer.toString(rmd)+s;
                copy/=8;
            }
            p.println(s);
            break;
            case 3:
            while(copy!=0)
            {
                rmd=copy%2;
                s=Integer.toString(rmd)+s;
                copy/=2;
            }
            System.out.print(s);
            default:
            p.println("WRONG CHOICE");
        }
    }
}
