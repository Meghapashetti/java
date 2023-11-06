import java.lang.String;
public class stringex
{
 public static void main(String args[])
{
 String greeting="hello";
 String name="john";
 
 String welcomeMessage=greeting+name;
 System.out.println(welcomeMessage);

 int length=welcomeMessage.length();
 System.out.println("length of the message: "+length);
 
 char firstChar=welcomeMessage.charAt(0);
 System.out.println("first character: "+firstChar);

 String substring=welcomeMessage.substring(7);
 System.out.println("substring from index 7: "+substring);
 
 int age=25;
 String ageString=String.valueOf(age);
 System.out.println("age as string:"+ageString);

 String anotherName="john";
 if(name.equals(anotherName))
 {
  System.out.println("the name are equal");
 }
 else
 {
  System.out.println("the names are not equal");
 }
 
 String sentence="java programming is fun and java is versatile";
 int indexOfjava=sentence.indexOf("java");
 System.out.println("index of java:"+indexOfjava);

 String replacedsentence=sentence.replace("java","python");
 System.out.println("after replacement:"+replacedsentence);
 
 String upperCaseMessage=welcomeMessage.toUpperCase();
 String lowerCaseMessage=welcomeMessage.toLowerCase();
 System.out.println("upper case:"+upperCaseMessage);
 System.out.println("lower case:"+lowerCaseMessage);
}
}
