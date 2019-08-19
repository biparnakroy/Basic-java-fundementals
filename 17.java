/*
Quuestion: QUEUE_DATA_STRUCTURES
Write a program to implement all operation of Queue using arrays. The program should be a menu 
driven program with all the options displayed and must have error messages, for when the Queue is full or empty.
*/
/*
Algorithm:
Step 1: Start
Step 2: Present user with choices to push, pop, peep or exit
              If user chooses push goto Step 3
              If user chooses pop goto Step 4
              If user chooses peep goto Step 5
              If user chooses exit goto Step 6
Step 3: Check if array is full
If true display “Queue Overflow” else accept a value from user and add it to the array and increment rear pointer value by 1(originally -1)(If front pointer=-1 increase by 1)
               Goto Step 2 
Step 4: Check if front pointer(originally -1) is -1 or equal to rear pointer
              If true display “Stack Underflow” else increment pointer’s value by 1
              Goto Step 2
Step 5: Display all elements from front to rear pointer
              Goto Step 2
Step 6: Stop.
*/
//code:
import java.util.*;
class queue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
intarr[]=new int[10];
int front=-1,rear=-1;
        while(true)
        {
System.out.println("1.push");
System.out.println("2.pop");
System.out.println("3.peep");
System.out.println("4.exit");
System.out.println("enter your choice");
intch=sc.nextInt();
            switch(ch)
            {
                case 1:
                if(rear>9)
                {
System.out.println("queue overflow");
                }
                if(front==-1||rear==-1)
                {
                    front=0;
                    rear=0;
                }
System.out.println("enter a number");
arr[rear++]=sc.nextInt();
                break;
                case 2:
                front+=1;
                if(front==-1||front>rear)
                {
System.out.println("queue underflow");
                }
                break;
                case 3:       
for(inti=front;i<rear;i++)
                {
System.out.println(arr[i]+" ");
                }
System.out.println();
                break;
                case 4:
System.exit(0);
                default:
System.out.println("invalid input");
            }
        }
    }
}
