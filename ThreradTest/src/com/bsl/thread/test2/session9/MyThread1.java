package com.bsl.thread.test2.session9;

public class MyThread1 extends Thread {
	
	private MyOneList list;
	public MyThread1(MyOneList list) {
		this.list=list;
	}
	public void run() {
		MyService service = new MyService();
		service.addServiceMethod(list, "A");
	}
}
