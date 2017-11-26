package com.bsl.thread.test3.notify;

public class ThreadA extends Thread {

	private Object lock;
	public ThreadA(Object lock){
		this.lock=lock;
	}
	public void run(){
		Service service = new Service();
		service.testMethod(lock);
	}
}
