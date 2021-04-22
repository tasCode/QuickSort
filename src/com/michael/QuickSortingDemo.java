package com.michael;

import java.util.Arrays;

public class QuickSortingDemo {
	public static void main(String[] args) {
		int[] arr = {-9,78,0,23,-576,70};
		getQuickSorting(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void getQuickSorting(int[] arr,int left,int right) {
		int l = left;
		int r = right;
		int temp = 0;
		int pivot = arr[(left+right)/2];
		while(l<r) {
			while(arr[l]<pivot) {
				l++;
			}
			while(arr[r]>pivot) {
				r--;
			}
			if(l>=r) {
				break;
			}
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			if(arr[l]==pivot) {
				r--;
			}
			if(arr[r]==pivot) {
				l++;
			}
		}
			if(l==r) {
				l++;
				r--;
			}
			if(left<r) {
				getQuickSorting(arr,left,r);
			}
			if(right>l) {
				getQuickSorting(arr,l,right);
			}
	}
}
