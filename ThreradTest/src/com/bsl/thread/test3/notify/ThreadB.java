package com.bsl.thread.test3.notify;

public class ThreadB extends Thread {

	private Object lock;
	public ThreadB(Object lock){
		this.lock=lock;
	}
	public void run(){
		Service service = new Service();
		service.testMethod(lock);
	}
}
