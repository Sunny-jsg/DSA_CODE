package in.test;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static int minJumps(int[] arr) {
        if (arr == null || arr.length <= 1) return 0;
        int n = arr.length;
        if (arr[0] == 0) return -1;

        long maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps;
            maxReach = Math.max(maxReach, (long)i + arr[i]);
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxReach) return -1;
                steps = (int)(maxReach - i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr2 = {2, 1, 0, 3};
        int[] arr3 = {0, 10, 20};
        
        System.out.println(minJumps(arr1));  // Works now
        System.out.println(minJumps(arr2));
        System.out.println(minJumps(arr3));
    }
}