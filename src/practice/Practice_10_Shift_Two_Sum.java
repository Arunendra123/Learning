package practice;

import java.util.Arrays;

public class Practice_10_Shift_Two_Sum {

		public static String getShift(String str, int shift) {
			char x = 0;
			String strr = "";
			for (int i = 0; i < str.length(); i++) {
				x = (char) (str.charAt(i) + shift + i);
				if (x >= 'Z') {
					x = (char) ('A' + x - 'Z' - 1);
				} else if (x >= 'z') {
					x = (char) ('a' + x - 'z' - 1);
				}
				strr = strr + x;
			}
			return strr;
		}

		// two pointer for two sum
		public static boolean twoSum(int a[], int s, int i) {
			int j = a.length - 1;
			while (i < j) {
				if (s < a[i] + a[j]) {
					i++;
				} else if (s > a[i] + a[j]) {
					j--;
				} else {
					return true;
				}
			}
			return false;
		}

		// Brute force finding triplet
		public static boolean getTriplet(int a[]) {
			/*
			 * for(int i=0;i<n;i++) for(int j=i+1;j<n;j++) for(int k=j+1;k<n;k++)
			 * if(a[i]+a[j]+a[k]==0) { return true; } return false;
			 */
			for (int i = 0; i < a.length - 1; i++) {
				if (twoSum(a, -a[i], i + 1))
					return true;
			}
			return false;
		}

		// binary search
		public static int binarySearch(int arr[], int l, int r, int n) {
			if (r >= l) {
				int m = l + (r - l) / 2;
				if (arr[m] == n)
					return m;
				if (n > arr[m])
					return binarySearch(arr, m + 1, r, n);
				return binarySearch(arr, l, m - 1, n);
			}
			return -1;
		}

		public static void main(String args[]) {

			String str = "Z";
			System.out.println(getShift(str, 1));

			int arr[] = { 2, 3, 4, 5, 5, 4, -5, 9, 3, -2, 0 };
			System.out.println(getTriplet(arr));

			Arrays.sort(arr);
			System.out.println(Arrays.binarySearch(arr, 2));
			System.out.println(binarySearch(arr, 0, arr.length - 1, 2));
		}
}

