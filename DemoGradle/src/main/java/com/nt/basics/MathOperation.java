package com.nt.basics;

public class MathOperation {

	public int sum (int x, int y) {
		return x+y;
		}
		public static void main(String[] args) {
		MathOperation operation = null;
		operation = new MathOperation();
		System.out.println("Result is: "+operation.sum(10, 20));


	}

}
