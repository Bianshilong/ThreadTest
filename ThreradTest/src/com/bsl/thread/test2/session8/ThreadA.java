package com.bsl.thread.test2.session8;

public class ThreadA extends Thread {
	private Service service;
	public ThreadA(Service service) {
		super();
		this.service=service;
	}
	public void run() {
		service.a();
	}
}
