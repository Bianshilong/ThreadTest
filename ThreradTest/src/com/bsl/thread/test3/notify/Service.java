package com.bsl.thread.test3.notify;

public class Service {
	public void testMethod(Object lock){
		try {
			synchronized (lock) {
				System.out.println("begin wait() ThreadName="+Thread.currentThread().getName());
				lock.wait();
				System.out.println("end wati() ThreadName="+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
