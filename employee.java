class employee
{
 float salary=40000;
}
 class Programmer extends employee
 {
  int bonus=10000;
  public static void main(String args[])
  {
   Programmer p=new Programmer();
   System.out.println("programmer salart is:"+p.salary);
   System.out.println("bonus of the programmer is:"+p.bonus);
  }
 }

 