import java.util.Scanner;
public class triangle
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("enter the length of slide1");
  int side1=s.nextInt();
  System.out.println("enter the length of slide2");
  int side2=s.nextInt();
  System.out.println("enter the length of slide3");
  int side3=s.nextInt();
  if(side1==side2&&side2==side3)
  {
   System.out.println("its a equilateral triangle");
  }
   else if(side1==side2||side2==side3||side1==side3)
  {
   System.out.println("its a isoceles triangle");
  }
  else
  {
   System.out.println("its a scalene triangle");
  }
 }
}

   