package com.bsl.thread.test2.session9;

public class MyThread2 extends Thread {
	
	private MyOneList list;
	public MyThread2(MyOneList list) {
		this.list=list;
	}
	public void run() {
		MyService service = new MyService();
		service.addServiceMethod(list, "B");
	}
}
