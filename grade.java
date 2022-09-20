import java.util.*;   
public class grade
{ 
    public static void main(String args[]) 
    {   try
         {
        Scanner sc = new Scanner(System.in); 
        int n;     
        System.out.println("Enter the total subjects ");
        n=sc.nextInt();
        int arr[] = new int[n]; 
        for(int i=0;i<n;i++)  
        {
            System.out.println("Enter subject mark:");
            arr[i]=sc.nextInt();
       if(arr[i] <=0)
	  throw new ArithmeticException("Invalid due to zero/negative value");
            
        }
        
        int total=0;
        for(int i=0;i<n;i++)
        {
            total=total+arr[i];
        }
        System.out.println("The total marks obtained is "+total);
        float aggregate; 
        aggregate = (total / (float)n);
        if(aggregate>75 && aggregate<=100)
         {
        System.out.println( "grade is DIstinction");
          }
       else if(aggregate>=60 && aggregate <75)
        {
         System.out.println( "grade is first division");
           }
      else if(aggregate>=50 && aggregate <60)
            {
             System.out.println( "grade is second division");
             }
      else if(aggregate>=40 && aggregate <50)
           {
         System.out.println( "grade is third division");
           }
           else
         {
       System.out.println( "grade is fail");
         }
 catch(ArithmeticException e)
   {
   System.out.println(e.getMessage());
    } 
 catch(Exception e)
 {
 System.out.println("Invalid due to floating point");
 }
        System.out.println( "Total Percentage : " + aggregate + "%");                         
    }   
}
}