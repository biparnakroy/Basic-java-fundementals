//@Author:Dungeon_Master
import java.io.*;
class XI_1
{
    public static void main(String args[])throws IOException
    {   
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        p.println("ENTER THE TIME\nHOURS:");
        int h=Integer.parseInt(in.readLine());
        p.println("MINUTES :");
        int m=Integer.parseInt(in.readLine());
        if((h>=1&&h<=12) &&(m>=0&&m<=59))
        {
            if(m==0)
                p.println(h+" 0'clock");
            else if(m==1)
                p.println(speller(m)+" minute past "+speller(h));
            else if(m>1 && m<15)
                p.println(speller(m)+" minutes past "+speller(h));
            else if(m==15)
                p.println("quater past"+speller(h));
            else if(m>15 && m<30)    
                p.println(speller(m)+"minutes past "+speller(h));
            else if(m==30)
                p.println("half past"+speller(h));
            else if(m==59)
                p.println(speller(60-m)+"minute to "+speller(h+1));
            else if(m>30 && m!=45)
                p.println(speller(60-m)+"minutes to "+speller(h+1));
            else if (m==45)
                p.println("quater to "+speller(h+1));
        }
        else
            p.println("INVALID INPUT");
    }
    static String speller(int x)
    {
        if(x==1)
        return("One ");
        if(x==2)
        return("two  ");
        if(x==3)
        return("three  ");
        if(x==4)
        return("Four  ");
        if(x==5)
        return("five  ");
        if(x==6)
        return("six  ");
        if(x==7)
        return("seven  ");
        if(x==8)
        return("eight  ");
        if(x==9)
        return("nine  ");
        if(x==10)
        return("ten  ");
        if(x==11)
        return("eleven  ");
        if(x==12)
        return("twelve  ");
        if(x==13)
        return("thirteen  ");
        if(x==14)
        return("fourteen  ");
        if(x==16)
        return("sixteen  ");
        if(x==17)
        return("Seventeen  ");
        if(x==18)
        return("Eighteen  ");
        if(x==19)
        return("Nineteen  ");
        if(x==20)
        return("twenty  ");
        if(x==21)
        return("twenty one  ");
        if(x==22)
        return("twenty two  ");
        if(x==23)
        return("twenty three  ");
        if(x==24)
        return("twenty four  ");
        if(x==25)
        return("twenty five  ");
        if(x==26)
        return("twenty six  ");
        if(x==27)
        return("twenty seven  ");
        if(x==28)
        return("twenty eight  ");
        if(x==29)
        return("twenty nine  ");
        return("");
    }
}
        


        
    