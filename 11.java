/* Question: CIRCULAR QUE (DATA STRUCTRUES)
Write a java program to implement all operations of a Circular Queue using array. The program 
should be a menu driven program with all the options displayed and must have error messages, for when the Queue is full or empty.
*/
/* Algorithm:
Step1: start
Step2: import java.io class and create a class “cir_queue”
Step3: declare and initialize variables
 int front = int rear=-1, int arr[], and int n
Step4: create a class constructor cir_queue(int s) where int s is the length of the array arr[]
	In the constructor declare:
		n=s, arr=new int[s], (creating an array of size n every timer an object is created)
Step5: create a function void insert() inside it perform the following functions
	( structure of an array of size 5: ¬| 0 | 1 | 2 | 3 | 4 |  the index starts from 0 so the last index is (5-1) i.e. 4)
If front = 0 and rear = n-1 then 
	Print “ Queue is full”
	Return to the main method.
If rear= -1 (i.e. if the queue is empty) then
	front= rear=0 (to shift the index at the 0th position)
else if rear=n-1 (i.e. if the index has reached last position) then
	rear=0 ( i.e. shifting the index again to the 0th position)
else 
	rear=rear+1
arr[rear]= input from the user.
Step6: create a function void delete() inside it perform the following functions.
		If front=-1 (i.e. the queue is empty) then
			Print “QUEUE UNDERFLOW”
		If front = rear (i.e. only one element is left in the queue) then
			Front= rear= -1
		Else if front = n-1 (i.e. if the starting index has reached the (n-1)th place)
			Front=0 (i.e. shifting the starting index back to the 1st place)
		Else
Front=front+1 (shifting the starting index by 1 place thereby deleting the 1st element)
Step7:	create a function void display() perform the following functions
	Declare a variable int I (loop counter variable)
	If front=-1 or front= rear+1 i.e. if starting index is more than last index then
		Print “QUEUE UNDERFLOW”
	If front ≤ rear then
		for i = front till i ≤ rear perform the following functions
			 Print the ith element of the arr[]
			 i=i+1
	Else perform these 
		For i = front till i ≤ n-1 perform the following functions
			Print the ith element of the arr[]
			i=i+1
		For i = 0 till i ≤ rear perform the following functions
Print the ith element of the arr[]
			i=i+1
Step8: Create a main function inside it  declare int t and int ch
	Print “ENTER THE SIZE OF THE QUEUE”
	S=Input from the user (length of the array)
	Create an object ob of the class
		Cir_queue ob = new cir_queue()
	While (true) {infinite loop}
		Print "ENTER UR CHOICE\n1.FOR INSERTING\n2.FOR DELETING\n3.FOR           DISPLAY\n4.FOR EXITING"
	Ch  = input from the user
	Start a switch case:  with ch as the switch variable
		In case ch=1
			Ob.insert()
			End case.
	
In case ch=2
			Ob.delete()
			End case.
	In case ch=3
			Ob.display()
			End case.
		In case ch= 4 
			Exit program
		Else  
			Print “ wrong choice”
Step 9: end main
Step 10: end class
*/
//code:
import java.io.*;
class cir_queue
{ 
    int front=-1,rear=-1,arr[],n;
    cir_queue(int s)
    {
        n=s;
        arr=new int[s];
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader  in = new BufferedReader(read);
        PrintWriter p= new PrintWriter(System.out,true);
        int s,ch;
        p.println("ENTER THE SIZE OF THE QUEUE");
        s=Integer.parseInt(in.readLine());
        cir_queue ob=new cir_queue(s);
        while(true)
        {
            p.println("ENTER UR CHOICE\n1.FOR INSERTING\n2.FOR DELETING\n3.FOR DISPLAY\n4.FOR EXITING");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:
                ob.insert();
                break;
                case 2:
                ob.delete();
                break;
                case 3:
                ob.display();
                break;
                case 4:
                System.exit(0);
                default:
                p.println("WRONG CHOICE");
            }
        }
    }
     void insert()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader  in = new BufferedReader(read);
        if(front==0 &&rear==(n-1))
        {System.out.println("QUE OVERFLOW");
            return;
        }
        if(rear==-1)
        {
            front=rear=0;
        }
        else if(rear==(n-1))
        {
            rear=0;
        }

        else
            rear++;
        arr[rear]=Integer.parseInt(in.readLine());
    }
     void delete()
    {
        if(front==-1)
        {
            System.out.print("QUEUE UNDERFLOW");
            return;
        }
        if(front==rear)
            front=rear=-1;
        else if(front==(n-1))
            front=0;
        else
            front++;
    }
    void display()
    {
        int i;
        if(front==-1||(front==rear+1))
        {
            System.out.print("QUEUE UNDERFLOW");
            return;
        }
        if(front<=rear)
            for(i=front;i<=rear;i++)
                System.out.println(arr[i]);
        else
        {
            for(i=front;i<=n-1;i++)
                System.out.println(arr[i]);
            for(i=0;i<=rear;i++)
                System.out.println(arr[i]);
        }

    }
}
