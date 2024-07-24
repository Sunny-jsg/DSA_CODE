import java.util.Scanner;
class Demo{
  static int max1(int a ,int b, int c){
  if(a > b )
   return a;
   else if ( a > c)
    return a;
	else if (b > c)
	 return b;
	 else 
	 return c;
	 }
	 static int max2(int a ,int b, int c){
	  return (a > b && a > c) ? a:((b > c) ? b:c);
	  }
	 }
 public class Yadav{
 public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter a value::");
	int a = obj.nextInt();
	System.out.println("Enter b value::");
	int b = obj.nextInt();
	System.out.println("Enter c value::");
	int c = obj.nextInt();
	System.out.println("max1 value from version= "+Demo.max1(a,b,c));
	System.out.println("max2 value from version= "+Demo.max2(a,b,c));
	}	
 }