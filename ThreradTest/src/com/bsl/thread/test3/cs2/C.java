package com.bsl.thread.test3.cs2;

public class C {

	private String lock;
	public C(String lock){
		this.lock=lock;
	}
	
	public void getValue(){
		synchronized (lock) {
			if (ValueObject.value.equals("")) {
				System.out.println("消费者"+Thread.currentThread().getName()+"WAITING 了 △");
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("消费者"+Thread.currentThread().getName()+"RUNNABLE 了");
			ValueObject.value="";
			//多个消费者时，为了避免假死，使用notifyAll()
//			lock.notify();
			lock.notifyAll();
		}
	}
}
