package com.bsl.thread.test3.wait;

public class Subtract {

	private String lock;
	public Subtract(String lock) {
		this.lock=lock;
	}
	public void substract() {
		try {
			synchronized (lock) {
				//使用if会导致条件更改，逻辑错误，线程终止
//				if (ValueObject.list.size()==0) {
				//使用while会导致后一个被等待调用的线程进入死循环
					while (ValueObject.list.size()==0) {
					System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
					lock.wait();
					System.out.println("wait end ThreadName="+Thread.currentThread().getName());
				}
				ValueObject.list.remove(0);
				System.out.println("list size="+ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
