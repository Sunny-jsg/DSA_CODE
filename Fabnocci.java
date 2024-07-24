import java.util.ArrayList;
import java.util.Scanner;
class Demo {
   static ArrayList  fab(int n) {
		 ArrayList  al = new ArrayList();
		 int a =0;
		 int b =1;
		 al.add(a);
		 al.add(b);
		 for(int i=1; i< n ;i++) {
			 int c = a+ b;
			 al.add(c);
			 a=b;
			 b=c;
		 }
		 return al;
	 } 
}
class Fabnocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER n VALUE::");
		int n = sc.nextInt();
		System.out.println("get fabonacci number"+ Demo.fab(n));
	}

}	 