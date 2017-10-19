package com.test.dataStucture;

/**
 * @author ZhangWK 插入排序 第一个数与后面的每个数作对比
 */
public class SelectionSort {
	public static void sort(int[] s) {
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] > s[j]) {
					int temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (int i : s) {
			System.out.print(i + " "); 
		}
	}

	public static void main(String[] args) {
		int[] s = { 6, 4, 3, 8, 2, 0 };
		sort(s);
		System.out.println();
	}
}
