package com.bsl.thread1.current;

public class MyThread extends Thread{
	
	public MyThread() {
		System.out.println("构造方法的打印："+Thread.currentThread().getName());
	}
	public void run() {
		System.out.println("run方法的打印："+Thread.currentThread().getName());
	}
}
