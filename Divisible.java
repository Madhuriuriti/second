 import java.util.*;
class Divisible
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
   
          int n;
 
          System.out.println("Enter the value of n");
          n=sc.nextInt();
          
       
          if (n%2==0 && n%3==0)
                  System.out.println(n+"and"+"is divisble by 2 and 3");
          else
                  System.out.println(n+" "+"isnot divisble by 2 and 3);
       }
}