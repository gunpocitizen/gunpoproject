package com.yun.myapp;

public class Consumer implements Runnable{
	QueueEx q;
	
	Consumer(QueueEx q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	
	public void run() {
		while(true) {
			q.get();
		}
	}
}
