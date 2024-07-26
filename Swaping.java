//Swaping of two number;
import java.util.Scanner;
class Demo{
  static void swap(int a,int b){
  System.out.println("Before Swaping a = "+ a + " and b = "+b);
    int t ;
	t =a;
	a=b;
	b =t;
	System.out.println("After Swaping a = "+ a + " and b = "+b);
	}
}
class Swaping{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("ENTER a value::");
 int a = sc.nextInt();
 System.out.println("ENTER b value::");
 int b = sc.nextInt();
  Demo.swap(a,b);
  }
 } 
 
