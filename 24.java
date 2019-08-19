/*
Question:
Implement all the operations of De-queue using array. Implementation of both input restricted and output restricted queue is required.
*/
/*
Algorithm:
Main()
Step 1.	Initialize BufferedReader, input size and choice and create object
Step 2.	If choice is 1 or 2,setint c as 0, and run loop construct while c is not equal to 0
Step 3.	Take insert choice from user again according to choice given earlier
Step 4.	Open Switch case, enter element to be inserted or delete according to choice from the different cases, and send to different functions
a.	switch(c)
b.	{
c.	    case 1:
d.	System.out.print("Enter element to be inserted::");
e.	intele=Integer.parseInt(br.readLine());
f.	ob.inRear(ele);
Step 5.	case 5 and 6 and display() and exit respectively
Step 6.	Stop
De_Queue()
Step 1.	Start
Step 2.	Initialize variables f, r and array Q taking parameter n
Step 3.	Stop.
inFront()
Step 1.	Start
Step 2.	Take parameter ele, and enter if-else construct
Step 3.	If f=0, Queue is full message is printed
Step 4.	If f=-1, then the r and f are set to 0 and ele is added, else q is added while front is decreased by 1
a.	else if(f==-1)
b.	{
c.	    f=0;
d.	    r=0;
e.	    Q[f]=ele;
f.	}
g.	 else
h.	    Q[--f]=ele;
Step 5.	Stop
inRear()
Step 1.	Start
Step 2.	Take parameter ele and enter if else construct
Step 3.	If Queue is full, print message
Step 4.	If f=-1, then set f=0, r=0 and add ele to q
Step 5.	If not, then add ele to the rear of Q
a.	Q[++r]=ele;
Step 6.	Stop.

delFront()
Step 1.	Start
Step 2.	If f==-1, print the Q is empty
Step 3.	If not empty, if f==r, then f=-1 and r=-1, else r is decreased by 1.
a.	if(f==r)
b.	{
c.	       f=-1;
d.	       r=-1;
e.	}
f.	else
g.	        r--;
Step 4.	Stop
Display()
Step 1.	Start
Step 2.	If queue is empty, print message
Step 3.	Else run loop from f to r and print the elements of Q
Step 4.	Stop
*/
//code:
import java.io.*;
class De_Queue_25
{
intf,r;
intQ[];
    De_Queue_25(int n)/**For initializing the queue*/
    {
        f=-1;
        r=-1;
        Q=new int[n];
    }

    /**end of De_Queue_25()*/
    void inFront(intele)/**To insert from the front*/
    {
        if(f==0)/**If queue is full*/
System.out.println("Queue is full!");
        else if(f==-1)/**If queue is not initialized*/
        {
            f=0;
            r=0;
            Q[f]=ele;
        }
        else
            Q[--f]=ele;
    }
    /**end of inFront*/
    void inRear(intele)/**To insert from the rear*/
    {
        if(r==(Q.length-1))/**If queue is full*/
System.out.println("Queue is full!");
        else if(f==-1)/**If queue is not initialized*/
        {
            f=0;
            r=0;
            Q[r]=ele;
        }
        else
            Q[++r]=ele;
    }
    /**end of inRear*/
    void delFront()/**To delete from the rear*/
    {
        if(f==-1)/**Checking for empty queue*/
System.out.println("Queue is empty!");
        else
        {
System.out.println("Deleted element::"+Q[f]);
            if(f==r)/**If the queue becomes empty after deleting then making it null*/
            {
                f=-1;
                r=-1;
            }
            else
                f++;
        }
    }
    /**end of delFront()*/
    void delRear()
    {
        if(r==-1)/**Checking for empty queue*/
System.out.println("Queue is empty!");
        else
        {
System.out.println("Deleted element::"+Q[r]);
            if(f==r)/**If the queue becomes empty after deleting then making it null*/
            {
                f=-1;
                r=-1;
            }
            else
                r--;
        }
    }
    /**end of delRear()*/
    void display()
    {
        if(f==-1)
System.out.println("Queue is Empty!");
        else
        {
for(inti=f;i<=r;i++)
System.out.println("Q["+i+"] =>"+Q[i]);
        }
    }
    /**end of display()*/
    public static void main(String args[])throws IOException
    {
BufferedReaderbr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of the queue::");
int l=Integer.parseInt(br.readLine());
        De_Queue_25 ob=new De_Queue_25(l);
System.out.println("Enter your choice::\n1)For input-restricted queue(rear-input)\n2)For output-restricted queue(front-delete)");
intch=Integer.parseInt(br.readLine());
        if(ch==1||ch==2)
        {
int c=0;
            while(c!=6)
            {
System.out.println("Enter your choice::");/**The following code restricts the input or output from the queue*/
System.out.println("1)For Insert At Rear");
System.out.println("2)For Delete At Front");
                if(ch!=1)System.out.println("3)For Insert At Front");
                if(ch!=2)System.out.println("4)For Delete At Rear");
System.out.println("5)Display");
System.out.println("6)Exit");
                c=Integer.parseInt(br.readLine());
                switch(c)
                {
                    case 1:
System.out.print("Enter element to be inserted::");
intele=Integer.parseInt(br.readLine());
ob.inRear(ele);
                    break;
                    case 2:
ob.delFront();
                    break;
                    case 3:
System.out.print("Enter element to be inserted::");
int ele2=Integer.parseInt(br.readLine());
ob.inFront(ele2);
                    break;
                    case 4:
ob.delRear();
                    break;
                    case 5:
ob.display();
                    break;
                    case 6:
System.exit(0);
                    default: System.out.println("Invalid choice!");
                }
            }
        }
        else
System.out.println("Invalid choice!");
    }/**end of main()*/
}/**end of class*/
