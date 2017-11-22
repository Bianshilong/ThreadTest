package com.bsl.thread1.current;

public class Run2 {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		//main线程调用构造函数，myThread线程调用run()方法
//		myThread.start();
		//main线程调用构造函数，main线程调用run()方法
		myThread.run();
	}

}
