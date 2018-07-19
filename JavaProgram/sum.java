import java.util.Scanner;
class Sum
{
      public static void main(String [] arg)
     {
    	Scannner scn=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n = scn.nextInt();
	int sum;
	for (int i=1;i<=n;i++)
	    {
 	      sum+=i;
            }
	  System.out.println("Sum of 1 to "+n+" is" + Sum);
        }
}