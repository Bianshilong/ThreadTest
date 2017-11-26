package com.bsl.thread.test3.wait;

public class MyRunnable {

	private static Object lock=new Object();
	private static Runnable runnable1 = new Runnable() {
		
		@Override
		public void run() {
			
			try {
				synchronized (lock) {
					System.out.println("wait begin timer="+System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("wait end timer="+System.currentTimeMillis());
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	private static Runnable runnable2 = new Runnable() {
		
		@Override
		public void run() {
			
				synchronized (lock) {
					System.out.println("notify begin timer="+System.currentTimeMillis());
					lock.notify();
					System.out.println("notify end timer="+System.currentTimeMillis());
				}		
		}
	};
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(runnable1);
		t1.start();
		/*注释线程休眠，会出现通知线程先执行的情况，
		导致通知过早，处于等待的线程还未执行，
		等执行后处于等待状态，无法接收到通知
		Thread.sleep(1000);*/
		/*Thread.sleep(10000);
		 * 休眠时间超出等待的时间，会自动唤醒等待的线程
		 * */
		Thread.sleep(1000);
		Thread t2 = new Thread(runnable2);
		t2.start();
	}
}
