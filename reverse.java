import java.util.Scanner;
public class reverse
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner number=new Scanner(System.in);
  System.out.println("enter a number");
  int num=number.nextInt();
  {
   a=num/100;
   b=(num/10)%10;
   c=num%10;
  }
  System.out.println("cab= "+c+b+a);
 }
}