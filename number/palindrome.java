/*
A palindrome number is a number that when reversed gives the same number eg:111,121,13331,4444,414 and so on
INPUT:
121
OUTPUT:
PALINDROME
*/
import java.io*;
class palindrome
{
  public static void main(String args[])throws IOException
  {
      try{
      InputStreamReader read=new InputStreamReader(System.in);
      BufferedReader in =new BufferedReader(read);
      System.out.println("ENTER THE NUMBER");
      int n= Integer.parseInt(in.readLine());
      int copy=n,s=0;
      while(copy!=0)
      {
        s=(copy%10)+s;
        copy/=10;
        }
        if(s==n)
        System.out.println("THE NUMBER IS PALINDROME");
        else
        System.out.println("THE NUMBER IS NOT PALINDROME");
        }
        catch(Exception e){}
    }
}
        
