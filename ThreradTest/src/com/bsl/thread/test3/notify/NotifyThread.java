package com.bsl.thread.test3.notify;

public class NotifyThread extends Thread{
	private Object lock;
	public NotifyThread(Object lock){
		this.lock=lock;
	}
	public void run(){
		synchronized (lock) {
			//通知全部等待线程
			lock.notifyAll();
			//随意通知一个处于等待的线程
//			lock.notify();
		}
	}
	
}
