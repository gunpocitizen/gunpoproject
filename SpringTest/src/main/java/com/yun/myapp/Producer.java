package com.yun.myapp;

public class Producer implements Runnable{
	QueueEx q;
	
	Producer(QueueEx q){
		this.q = q;
		new Thread(this, "Producer").start();
	}
	
	public void run() {
		int i = 0;
		
		while(true) {
			q.put(i++);
		}
	}
}
