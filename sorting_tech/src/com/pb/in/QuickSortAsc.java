package com.pb.in;
import java.util.*;
public class QuickSortAsc {
	static void quickSort(int a[], int lIndex, int hIndex) {
		if (lIndex >= hIndex)
			return;
		int pivot, lp, rp, temp;
		pivot = a[hIndex];
		lp = lIndex;
		rp = hIndex -1 ;
 		while (lp < rp) {
			while (a[lp] <= pivot && lp < rp)
				lp++;
			while (a[rp] >= pivot && lp < rp)
				rp--;
			temp = a[lp];
			a[lp] = a[rp];
			a[rp] = temp;
		}
		temp = a[lp];
		a[lp] = a[hIndex];
		a[hIndex] = temp;
		quickSort(a, lIndex, lp - 1);
		quickSort(a, lp + 1, hIndex);

	}
	public static void main(String[] args) {
		/*Random r = new Random();
		int a[] = new int[10];
		for(int i =0;i<a.length;i++) 
			a[i] = r.nextInt(100);*/
		int a[] = {5,3,1,2,9,8,7,4,6};
		System.out.println("Before Sorting::"+Arrays.toString(a));
		quickSort(a,0,a.length-1);
		System.out.println("After Sorting::" + Arrays.toString(a));
	}

}
