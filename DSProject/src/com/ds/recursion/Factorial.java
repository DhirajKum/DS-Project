package com.ds.recursion;

public class Factorial {


	int fact(int n) {
		if(n==0) 
			return 1;
		return n*fact(n-1);
	}
	
	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println("Factorial value for given number ::: "+ fact.fact(4));
	}

}
