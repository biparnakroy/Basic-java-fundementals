//@Author:Biparnak roy
/*
Question:
Write a menu driven program to  do the following:
Choice1:
Input a number in Decimal system and convert it into its equivalent number in the hexadecimal number system.
Note: Hexadecimal Number system is a number system which can represent a number in any other number system in terms of digits ranging from 0 to 9 and then A-F only. This system consists of only sixteen basic digits i.e. 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E and F. Here 10 represents as A, 11 as B and so on till 15 which is represented as F.
For example: 47 in Decimal number system as be represented as 2F in the Hexadecimal number system.
Choice2:
 Input a number in Decimal system and convert it into its equivalent number in the octal number system.
Note: Octal Number system is a number system which can represent a number in any other number system in terms of digits ranging from 0 to7 only. This system consists of only eight basic digits i.e. 0, 1, 2, 3, 4, 5, 6 and 7. 
For example: 25 in Decimal number system as be represented as 31 in the octal number system.
Choice3:
 Input a number in Decimal system and convert it into its equivalent number in the binary number system.
Note: Binary Number system is a number system which can represent a number in any other number system in terms of digits ranging from 0 and 1 only. This system consists of only two basic digits i.e. 0 and 1. 
For example: 25 in Decimal number system as be represented as 11001 in the binary number system.
*/
/*
Algorithm:
Step1: Start
Step2: Ask the user for choice 1,2 or 3 and store the choice in int x
Step3: take the number as input from the user and store it in int n
Step5:  declare variables  int copy, int rmd, and string s, and initialize copy=n
Step6:  start a switch with int x as the switch variable
	Switch(x)
	Case1:
	Create an array char ch[]={'A','B','C','D','E','F','G'}
	While copy≠0 then continue performing following steps
	{
rmd= remainder of copy/16
		if rmd≤10  then
	   s=Integer.toString(rmd)+s  [converting rmd to string then concatenating ]
	else
	  s= character at (rmd-10)th position of ch[]+s 
	copy=copy/16
}
Print s
Case2:
While copy≠0 continue performing the following steps
        {
	rmd = remainder of copy/8
	s=Integer.toString(rmd)+s  [converting rmd to string then concatenating ]
	copy=copy/8
       }
Print s
Case3:
While copy≠0 continue performing the following steps
        {
	rmd = remainder of copy/2
	s=Integer.toString(rmd)+s  [converting rmd to string then concatenating ]
	copy=copy/2
       }
Print s
For any other input print “
Step7: end
*/
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
            case 1://HEX CONVERSION
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
            case 2: //OCTAL CONVERSION
            while(copy!=0)
            {
                rmd=copy%8;
                s=Integer.toString(rmd)+s;
                copy/=8;
            }
            p.println(s);
            break;
            case 3://BINARY CONVERSION
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
