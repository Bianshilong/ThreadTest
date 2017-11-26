package com.bsl.thread.test3.cs1;

public class Test {

	public static void main(String[] args) {

		String lock = new String("");
		P p=new P(lock);
		C c = new C(lock);
		ThreadP tp = new ThreadP(p);
		ThreadC tc = new ThreadC(c);
		tp.start();
		tc.start();
		
				
	}

}
