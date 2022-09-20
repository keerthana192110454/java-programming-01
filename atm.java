import java.util.*;
public class atm
{
public static void main(String[] args)
{
try {
        
Scanner sc= new Scanner(System.in);
int arr[]={100,200,500,2000};
System.out.print("Enter the 1st Denomination : ");
int a= sc.nextInt();
System.out.print("Enter the 1st Denomination number of notes: ");
int a1= sc.nextInt();
System.out.print("Enter the 2nd Denomination: ");
int b= sc.nextInt();
System.out.print("Enter the 2nd Denomination number of notes: ");
int b1= sc.nextInt();
System.out.print("Enter the 3rd Denomination : ");
int c= sc.nextInt();
System.out.print("Enter the 3rd Denomination number of notes: ");
int c1= sc.nextInt();
System.out.print("Enter the 4th Denomination: ");
int d= sc.nextInt();
System.out.print("Enter the 4th Denomination number of notes: ");
int d1= sc.nextInt();
if(a1==100||b1==500||c1==200||d1==2000)
{
    int e=a*a1+b*b1+c*c1+d*d1;
    System.out.println("Total Available Balance in ATM = " +e);
}
else
{
      System.out.println("Enter the correct Denomination"); 
}
}
catch(Exception e)
{
    System.out.println("Total amount available in atm"); 
    }



}
}