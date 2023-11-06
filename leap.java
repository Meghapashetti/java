import java.util.Scanner;
public class leap
{
 public static void main(String args[])
 {
  Scanner year=new Scanner(System.in);
  System.out.println("enter a year");
  int num=year.nextInt();
  if(num%4==0)
  {
   if(num%100==0)
   {
    if(num%400==0)
    {
     System.out.println("it's a leap year "+num);
    }
    else
    {
     System.out.println(" it's not a leap year "+num);
    }
   }
   else
   {
     System.out.println("it's a leap year "+num);
   }
  }
  else
  {
   System.out.println(" it's not a leap year "+num);
  }
 }
}


   

    
 