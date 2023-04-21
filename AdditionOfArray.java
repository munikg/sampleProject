package com.practice.sims;

public class AdditionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int add[] = { 10, 20, 30 };
		System.out.println("Array Elemnts Are :");
                System.out.println("Array Elemnts Are :");
                System.out.println("Array Elemnts Are :");
		for (int i = 0; i < add.length; i++) {
			System.out.println(add[i]);
			result = add[i] + result;
		}
		System.out.println("Addition of Array elemnts:" + result);
//		System.out.println("printing array elements using foreach :");
//		for (int i : add) {
//			System.out.println(i);
//		}
	}

}
