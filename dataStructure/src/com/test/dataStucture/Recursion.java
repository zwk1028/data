package com.test.dataStucture;

/**
 * @author ZhangWK 递归算法 自己调用自己， 有跳出算法的条件
 */
public class Recursion {
	public static int add(int n) {
		if (n == 1) {
			return n;
		} else {
			return n + add(n - 1) ;
		}
	}
	public static int sub(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * sub(n - 1) ;
		}
	}

	public static void main(String[] args) {
		int n=10;
//		int sum = add(n);
		int sum = sub(n);
//		System.out.println("1+2+..."+n+" = "+sum);
		System.out.println("1*2*..."+n+" = "+sum);
	}
}
