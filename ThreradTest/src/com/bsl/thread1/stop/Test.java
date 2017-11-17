package com.bsl.thread1.stop;

//调用interrupt()方法来停止线程，但线程并未停止
public class Test {

	public static void main(String[] args) {
		
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}

	}

}
