/*Question:
Write a program to accept a expression in Infix Notation and print it Postfix Notation. (USING STACK)
*/
/* Algorithm:
main()
Step 1.	Start
Step 2.	Initialize BufferedReader
Step 3.	User input after dialogue
Step 4.	Iterate through the characters of the expression
Step 5.	If input element is operand, add to output, if open parenthesis, push in stack, if closing parenthesis then all the operands upto the opening parenthesis is added to output. A snippet:
a.	 while(arr[top] != '(')
b.	pofx[k++]=ob.pop();
c.	elem=ob.pop(); /* Remove (
d.	 }
e.	 else if(ch=='^'||ch=='*'||ch=='/'||ch=='%'||ch=='+'||ch=='-')
f.	    {       
g.	while( ob.pr(arr[top]) >= ob.pr(ch) )
h.	pofx[k++]=ob.pop();
i.	ob.push(ch);
j.	        }
k.	
Step 6.	Display the expression.
Step 7.	Stop.
Push():
Step 1.	Start.
Step 2.	Check whether stack is full or not
a.	 if(top==(n-1))
b.	    {
c.	System.out.println("Stack Overflow");
d.	       return;
e.	    }
Step 3.	Insert element by adding increasing top value
a.	  else if(top==-1)
b.	            top=0;
c.	        else
d.	            top=top+1;
e.	arr[top]=c;
f.	  }
Step 4.	Stop.
Pop():
Step 1.	Start.
Step 2.	Check whether stack is empty or not
a.	  if(top==-1)
b.	  {
c.	System.out.println("stack UnderFlow");
d.	     return '#';
e.	  }
Step 3.	Delete element from the top of the stack
a.	  return(arr[top--]);
Step 4.	Stop.
Pr():
Step 1.	Start.
Step 2.	Switch case for deciding precedence
a.	  switch(elem)
b.	        {
c.	            case '#': return 0;
d.	            case '(': return 1;
e.	            case '+':
f.	            case '-': return 2;
g.	            case '*':
h.	            case '%':
i.	            case '/': return 3;
j.	            case '^': return 4;
k.	        }
Step 3.	Stop.
*/
//code:
import java.io.*;
class InfixToPostfix
{
    static char arr[],pofx[]; 
    static String s;
    static int top=-1,n;
InfixToPostfix(int s)
    {
        n=s;
arr=new char[s];
pofx=new char[s];
    }
    void push(char c)
    {
        if(top==(n-1))
        {
System.out.println("Stack Overflow");
            return;
        }
        else if(top==-1)
            top=0;
        else
            top=top+1;
arr[top]=c;
    }
    char pop()
    {
        if(top==-1)
        {
System.out.println("stack UnderFlow");
            return '#';
        }
        return(arr[top--]);
    }
intpr(char elem)
{                 /* Function for precedence */
        switch(elem)
        {
            case '#': return 0;
            case '(': return 1;
            case '+':
            case '-': return 2;
            case '*':
            case '%':
            case '/': return 3;
            case '^': return 4;
        }
        return 0;
    }
    public static void main(String args[])throws IOException
    {
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
inti,k=0;
        char ch,elem;
System.out.println("Enter the size of array");
        n=Integer.parseInt(in.readLine());
InfixToPostfixob=new InfixToPostfix(n); 
System.out.println("Type in an expression like (1+2)*(3+4)/(12-5)\n "
            + "with no monadic operators like in-5 or +5 followed by key\n");
        s=in.readLine();
ob.push('#');
        for(i=0;i<s.length();i++)
        {
ch=s.charAt(i);
if(ch == '(')
ob.push(ch);
            else if( ch == ')')
            {
                while(arr[top] != '(')
pofx[k++]=ob.pop();
elem=ob.pop(); /* Remove ( */
            }
            else if(ch=='^'||ch=='*'||ch=='/'||ch=='%'||ch=='+'||ch=='-')/* Operator */
            {       
while( ob.pr(arr[top]) >= ob.pr(ch) )
pofx[k++]=ob.pop();
ob.push(ch);
            }
            else /* Operands */
pofx[k++]=ch;
        }
        while(arr[top]!='#')/*  Pop remaining operators from Stack   */
        {
pofx[k++]=arr[top--];
        }
System.out.println("The postfix expression is:");
        for(i=0;i<k;i++)
        {
System.out.print(pofx[i]);
        }
    }
}
