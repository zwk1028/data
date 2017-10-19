package com.test.dataStucture;

/**
 * @author ZhangWK
 * @see 插入排序 插入排序 从第二个数开始，以此为对比，与左边有序的数进行比较
 */
public class InsertSort {
	public static void sort(int[] s) {
		int i, j, temp;
		for (i = 1; i < s.length; i++) {// 比较次数
			temp = s[i];
			for (j = i - 1; j >= 0 && s[j] < temp; j--) {
				s[j + 1] = s[j];
			}
			s[j + 1] = temp;
		}
		for (int k : s) {
			System.out.print(k + " ");
		}
	}

	public static void main(String[] args) {
		int[] s = { 6, 4, 3, 8, 2, 0 };
		sort(s);
	}
}
