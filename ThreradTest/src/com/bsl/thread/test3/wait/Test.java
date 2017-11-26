package com.bsl.thread.test3.wait;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		String lock = new String("");
		Add add = new Add(lock);
		Subtract subtract = new Subtract(lock);
		ThreadSubtract st1 = new ThreadSubtract(subtract);
		st1.setName("ST1");
		st1.start();
		ThreadSubtract st2 = new ThreadSubtract(subtract);
		st2.setName("ST2");
		st2.start();
		Thread.sleep(1000);
		
		ThreadAdd ta = new ThreadAdd(add);
		ta.setName("TA");
		ta.start();
		
	}

}
