package com.bsl.thread.test3.cs2;

//多生产者和消费者的情况下，需要notifyAll()，避免线程假死
public class Test {

	public static void main(String[] args) throws InterruptedException {

		String lock = new String("");
		P p=new P(lock);
		C c = new C(lock);
		ThreadP[] tp = new ThreadP[2];
		ThreadC[] tc = new ThreadC[2];
		for (int i = 0; i < 2; i++) {
			tp[i]=new ThreadP(p);
			tp[i].setName("生产者"+(i+1));
			tc[i]=new ThreadC(c);
			tc[i].setName("消费者"+(i+1));
			tp[i].start();
			tc[i].start();
		}
		
		Thread.sleep(1000);
		Thread[] threadArray =new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i]+" "+threadArray[i].getState());
		}
		
	}

}
