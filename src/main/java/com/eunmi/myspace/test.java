package com.eunmi.myspace;

import java.util.Scanner;

public class test {
	int babo(int x, int y) {
		int i = x;
		int j = y;
		for (int a = i; a <= 9; a++) {
			for (int b = j; b <= 9; b++) {
				System.out.println(a + " x " + b + " = " + (a * b));
			}
			System.out.println("단 수 : " + a + "단");
		}
		x = i * j;
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			test c = new test();
			System.out.println("return : " + c.babo(a, b));

		} finally {
			sc.close();
		}
	}

}
