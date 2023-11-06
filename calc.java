public class calc
{
 public static int add(int a,int b)
{
 return a+b;
}
 public static double add(double a,double b)
 {
  return a+b;
 }
  public static int add(int a,int b,int c)
 {
  return a+b+c;
 }
  public static void main(String args[])
 {
  int sum1=add(5,3);
  double sum2=add(2.5,3.7);
  int sum3=add(1,2,3);
  System.out.println("sum1 "+sum1);
 System.out.println("sum2 "+sum2);
 System.out.println("sum3 "+sum3);
 }
}
    
