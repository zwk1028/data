package com.test.dataStucture;

/**
 * @author ZhangWK 冒泡排序 相邻两个数做对比
 */
public class BubbleSort {
	public static void sort(int[] s) {
		for (int i = 0; i < s.length - 1; i++) {// 冒泡趟数
			for (int j = 0; j < s.length - 1 - i; j++) {
				if (s[j] > s[j + 1]) {
					int temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
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
	}
}
