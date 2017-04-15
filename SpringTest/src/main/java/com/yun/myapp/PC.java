package com.yun.myapp;

public class PC {

	public static void main(String[] args) {
		QueueEx q = new QueueEx();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Press Contro-C to stop");

	}

}
