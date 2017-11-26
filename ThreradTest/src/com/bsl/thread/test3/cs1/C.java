package com.bsl.thread.test3.cs1;

public class C {

	private String lock;
	public C(String lock){
		this.lock=lock;
	}
	
	public void getValue(){
		synchronized (lock) {
			if (ValueObject.value.equals("")) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("get的value值是："+ValueObject.value);
			ValueObject.value="";
			lock.notify();
		}
	}
}
