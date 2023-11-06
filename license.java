import java.util.Scanner;
public class license
{
 public static void main(String args[])
 {
  Scanner scanner=new Scanner(System.in);
  System.out.println("enter your age");
  int age=scanner.nextInt();
  if(age>=18)
  {
   System.out.println("your are eligible to apply for a driving license");
  }
  else
  {
   System.out.println("your are not eligible to apply for a driving license");
  }
 }
}