import java.util.Scanner;
class Demo{
  static String prime(int n){
    int count =0;
	for(int i =1;i<=n;i++){
	  if(n % i == 0)
	    count ++;
		}
		if (count == 2) {
			return "prime Number";
		} else {
			return "not a prime number";
		}
	}
}	
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER n  VALUE::");
		int n = sc.nextInt();
		System.out.println(Demo.prime(n));

	}

}
