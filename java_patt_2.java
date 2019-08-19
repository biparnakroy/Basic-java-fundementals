/*pattern:

* * * * *
* * * *
* * *
* *
*

*/
//code:
import java.io.*;
class java_patt_2
{
  public static void main(String args[])throws IOException
    {
      InputStreamReader read =new InputStreamReader( new BufferedReader(System.in));
      System.out.println("ENTER THE SIZE OF PATTERN");
      int n = Integer.parseInt(in.readLine());
      int i=0;j=0;
      for(i=n;i>=1;i--)
      {
        for(j=i;j>=1;j--)
        {
          System.out.print("*");
          }
          System.out.println();
       }
    }
