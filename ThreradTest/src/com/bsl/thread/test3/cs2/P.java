package com.bsl.thread.test3.cs2;

public class P {
	private String lock;
	public P(String lock){
		this.lock=lock;
	}
	
	public void setValue(){
		synchronized (lock) {
			if (!ValueObject.value.equals("")) {
				System.out.println("生产者"+Thread.currentThread().getName()+"WAITING 了 ★");
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("生产者"+Thread.currentThread().getName()+"RUNNABLE 了");
			String value = System.currentTimeMillis()+"_"+System.nanoTime();
			ValueObject.value=value;
			//多个生产者时，为了避免假死，使用notifyAll()
//			lock.notify();
			lock.notifyAll();
		}
	}
}
