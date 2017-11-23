package com.bsl.thread.test2.session8;

public class Service {
	
	private String anything = new String();
	public void a() {
		
		try {
			synchronized (anything) {
				System.out.println("a begin");
				Thread.sleep(3000);
				System.out.println("a end");
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	public synchronized void b() {
		System.out.println("b begin");
		System.out.println("b end");
	}
}
