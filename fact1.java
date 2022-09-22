import java.util.Scanner;
class fact1
{
 public static void main(String args[])
{
 try
 {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the number:");
 int num = scanner.nextInt();
 if(num<=0)
 {
     System.out.println("Enter only positive numbers");
  }
 else
 {
 int factorial = fact(num);
 System.out.println("Factorial of entered number is: "+factorial);
 }
}
 catch(Exception e)
 {
   System.out.println("Enter only numbers");
  }
}



 static int fact(int n)
 {
 int output;
 if(n==1)
{
 return 1;
 }
 output = fact(n-1)* n;
 return output;
 }
}