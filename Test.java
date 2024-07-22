import java.util.Scanner;
class Demo{
  static int sumofn(int n){
      int sum =0;
	 for(int i =1;i<=n;i++){
	 sum = sum +i;
	 }
	 return sum;
	 }
} 
  class Test
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter n value");
int n = obj.nextInt();
System.out.println(Demo.sumofn(n));	 
}
}