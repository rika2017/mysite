package com.login;

public class longTest2 {
	public boolean testSearch(int[] a,int x) {
		int left = 0;
		int right = a.length -1;
		int mid;
		while(left <= right) {
			mid = (left + right)/2;
			if (a[mid] > x) {
				right = mid - 1;
			}else if(a[mid] < x) {
				left = mid + 1;
				
			}else if(a[mid] == x){
				return true;
			}
		}
		return false;
	}
}
