//@Author:Biparnak Roy
/*
Question:
Given a time in number we can convert it into words. For example:
5:00 ----- Five o’ clock
5:10 ----- ten minutes past five
5:15 ----- quarter past five
5:30 ------ half past five
5:40 ------ twenty minutes to six
5:45 ------ quarter to six
5:47 ------ thirteen minutes to six 
Write a program which first inputs two integers, the first between 1 and 12(both inclusive), the second between 0 and 59 (both inclusive) and then prints the time they represent, in words . Your program should follow the format of the examples above.
SAMPLE DATA:
1.	INPUT:		 TIME: 3  :  0
OUTPUT:    	3 : 00 Three o’ clock
2.	INPUT: 	TIME: 7  :  29
OUTPUT:	7 : 29 Twenty nine minutes past seven
3.	INPUT: 	TIME: 6  :  34
OUTPUT:	6 : 34 Twenty six minutes to seven
4.	INPUT: 	TIME: 12 : 01
OUTPUT: 	12 : 01 One minute past Twelve
5.	INPUT: 	TIME: 12 : 45
OUTPUT: 	12 : 45 Quarter to one
6.	INPUT: 	TIME: 10 : 59
OUTPUT: 	10:59  One minute to Twelve
7.	INPUT: 	TIME: 14 : 60
OUTPUT: 	INVALID INPUT
Test your program for the data values given in examples above and some random data.
*/
/*
Algorithm:
Main():
Step1: Start
Step2: Take (in numbers) as input from the user and store them in int h (hours) and int m      (minutes)
Step3: check ( h≥1 and h≤12) and (m≥0 and m≤59)
	If yes then proceed to step4
	else print “INVALI INPUT”
Step4:  [speller() is a function which returns the spelling of the numbers]
if m=0
	  Then print “ h”+”o’clock”
	else if m=1
	  then print “speller(m)”+”minutes past”+”speller(h)”
	else if m>1 and m<15
	  then print “speller(m)”+”minutes past”+”speller(h)”
	else if m=15
  then print “quarter past”+”speller(h)”
else if m>15 && m<30
   then print “speller(m)”+”minutes past”+”speller(h)”
else if m=30
  	   then print “Half past”+”speller(h)”
	else if m=59
   then print “speller(60-m)”+”minutes to”+”speller(h+1)”
else if m>30 and m≠ 45
   then print “speller(60-m)”+”minutes to”+”speller(h+1)”
else if m=45
  then print “quarter to”+”speller(h+1)”
Step5: end main


String speller( int x):
Step1: Start
Step2: accepting the parameter(the number to spell) and storing it in  int x
Step3:
 
	 if x=1
 then return         “One”
	if x=2
 then return “two”
	if x=3
 then return “three”
	if  x=4
 then return “four”
	if  x=5
 then return “five”
	if  x=6
 then return “six”
	if  x=7
 then return “seven”
	if  x=8
 then return “eight”
	if  x=9
 then return “nine”
	if  x=10
 then return “ten”
	if  x=11
 then return “eleven”
	if  x=12
 then return “twelve”
	if  x=13
 then return “thirteen”
	if  x=14
 then return “fourteen”
	if  x=16
 then return “sixteen”
	if  x=17
 then return “seventeen”
	if  x=18
then return “eighteen”
	if  x=19
 then return “nineteen”
	if  x=20
 then return “twenty”
	if  x=21
then return  “twenty one”
	if  x=22
then return “twenty two”
	if  x=23
 then return “twenty three”
	if  x=24
 then return “twenty four”
	if  x=25
 then return “twenty five”
	if  x=26
then return “twenty six”
	if  x=27
then return “twenty seven”
	if  x=28
 then return “twenty eight”
	if  x=29
then return “twenty nine”
 
else 
   return “” 
*/
//code
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
