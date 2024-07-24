import java.util.ArrayList;
import java.util.Scanner;
class Demo {
   static ArrayList  tribonacci(int n) {
		 ArrayList  al = new ArrayList();
		 int a =0;
		 int b =1;
		 int c =2;
		 al.add(a);
		 al.add(b);
		 al.add(c);
		 for(int i=1; i< n ;i++) {
			 int d = a+ b +c;
			 al.add(d);
			 a=b;
			 b=c;
			 c=d;
		 }
		 return al;
	 } 
}
class Trib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER n VALUE::");
		int n = sc.nextInt();
		System.out.println("get Tribonacci number"+ Demo.tribonacci(n));
	}

}	 