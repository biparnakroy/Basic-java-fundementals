/*Question: STACK (Data Structres)
Write a program to implement all operation of stack using arrays. The program should be a menu driven program with all the options 
displayed and must have error messages,for when the stack is full or empty.
*/
/*
Algorithm:
Step 1.	Start
Step 2.	Present user with choices to push, pop, peep or exit
Step 3.	Check if array is full. If true display “Stack Overflow” else accept a value from user and add it to the array and increment pointer value by 1(originally -1)
a.	if(t==9)
b.	System.out.println("Stack Overflow");
c.	else
d.	{
e.	System.out.println("Enter a number:");
f.	num=sc.nextInt();
g.	arr[++t]=num;
h.	}
Step 4.	Check if array is empty. If true display “Stack Underflow” else decrement pointer’s value by 1
a.	if(t==-1)
b.	System.out.println("Stack Undeflow");
c.	else
d.	{
e.	    for(i=0;i<=t;i++)
f.	System.out.println(arr[i]);
g.	}
Step 5.	Stop
*/
//code:
import java.util.*;
class Stack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
int t=-1,ch,i,num;
intarr[]=new int[10];
        do
        {
System.out.println("1.ADD");
System.out.println("2.DELETE");
System.out.println("3.PEEP");
System.out.println("4. EXIT");
System.out.println("Enter your choice:");
ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                if(t==9)
System.out.println("Stack Overflow");
                else
                {
System.out.println("Enter a number:");
num=sc.nextInt();
arr[++t]=num;
                }
                break;
                case 2:
                if(t==-1)
System.out.println("Stack Underflow");
                else
                    t--;
                break;
                case 3:
                if(t==-1)
System.out.println("Stack Undeflow");
                else
                {
                    for(i=0;i<=t;i++)
System.out.println(arr[i]);
                }
                break;
	             case 4: break;
                default:
System.out.println("Wrong Choice");
            }
        }
        while(ch!=4);
    }
}
