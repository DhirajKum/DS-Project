package com.ds.recursion;

public class FibonacciSequence {
static int f[] = new int[51];
	public int fib(int x) {
		if(x<=1)
			return x;
		if(f[x]!=-1)
		{
			return f[x];
		}
		f[x]=fib(x-1)+fib(x-2);
		return f[x]; 
	}
	
	public static void main(String[] args) {
		for (int i=0;i<51;i++) {
			f[i]=-1;
		}
		FibonacciSequence fs = new FibonacciSequence();
		System.out.println("fibonacci seriese value :::: " +fs.fib(46));
	}

}
