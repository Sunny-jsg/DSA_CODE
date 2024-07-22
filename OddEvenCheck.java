// Check given number is Even or Odd;
import java.util.Scanner;
class Driver{
  static String check_evenorodd(int n){
  if (n % 2 == 0)
     return "Even";
	 else 
	 return "Odd";
	 }
}
	public class  OddEvenCheck{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter n value::");
	int n = obj.nextInt();
	 System.out.println(Driver.check_evenorodd(n));
	 }
}	 
