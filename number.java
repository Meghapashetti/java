import java.util.Scanner;
public class number
{
 public static void main(String args[])
 {
  Scanner number=new Scanner(System.in);
  System.out.println("enter a number");
  int num=number.nextInt();
  if(num%3==0&&num%5==0)
  {
   System.out.println("hii hello");
  }
  else if(num%5==0)
  {
   System.out.println("hii");
  }
  else if(num%3==0)
  {
   System.out.println("hello");
  }
  else
  {
   System.out.println("num is invalid");
  }
 }
} 
  