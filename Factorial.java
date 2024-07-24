import java.util.Scanner;
class Demo{
 static int factorial(int n){
    int f =1;
	for(int i=1;i<=n;i++){
	  f = f*i;
	  }
	  return f;
	 }
}
public class Factorial{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter n value::");
	int n = obj.nextInt();
	 System.out.println(Demo.factorial(n));
	 }
}	 	 