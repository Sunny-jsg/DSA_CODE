import java.util.Arrays;
import java.util.Scanner;

public class BinarySearching {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size::");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " Elements::");
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
			System.out.println("Enter the value to search:");
			int key = sc.nextInt();
			Arrays.sort(a);
			System.out.println(Demo.binarySearch(a, key));
		
	}

}

class Demo {
	static int binarySearch(int a[], int key) {
		int l = 0, h = a.length - 1, mid;
		
		while (l <= h) {
			mid = (l + h) / 2;
			if (a[mid] == key)
				return mid;
			else if (a[mid] < key)
				l = mid + 1;
			else
				h = mid - 1;
		}
		return -1;

	}
}
