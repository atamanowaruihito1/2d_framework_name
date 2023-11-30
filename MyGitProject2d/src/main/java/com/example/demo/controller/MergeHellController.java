package com.example.demo.controller;

public class MergeHellController {
	public static void main(String[] args) {

		kadaiA();
		kadaiC();

	}

	static void kadaiA() {
		//問題
		for (int i = 0; i < 10; i++) {
			System.out.println("現在" + i + "回目です");
		}
	}

	static void kadaiC() {
		int a = 50;
		int b = 75;
		int c = a + b;
		System.out.println(c);
	}
}
