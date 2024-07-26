// find maximum number between two number;
import java.util.Scanner;
class Sunny{
  static int max_version(int a ,int b){
    if (a > b) 
    	  return a;
      else 
    	  return b;

   }
}
 public class Max {
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter a value");
	int a = obj.nextInt();
	System.out.println("Enter b value");
	int b = obj.nextInt();
	System.out.println("max value from version= "+Sunny.max_version(a,b));
	}	 

}
