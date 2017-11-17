package com.bsl.thread1.stop;

public class MyThread extends Thread{
	
	public void run() {
		super.run();
		for (int i = 0; i < 5000; i++) {
			System.out.println("i="+i);
		}
	}
	
}
