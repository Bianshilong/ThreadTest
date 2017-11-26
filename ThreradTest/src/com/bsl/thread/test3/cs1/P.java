package com.bsl.thread.test3.cs1;

public class P {
	private String lock;
	public P(String lock){
		this.lock=lock;
	}
	
	public void setValue(){
		synchronized (lock) {
			if (!ValueObject.value.equals("")) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			String value = System.currentTimeMillis()+"-"+System.nanoTime();
			System.out.println("set的value值是："+value);
			ValueObject.value=value;
			lock.notify();
		}
	}
}
