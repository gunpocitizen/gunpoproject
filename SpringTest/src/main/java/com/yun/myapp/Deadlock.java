package com.yun.myapp;

public class Deadlock implements Runnable {
	Aclass a = new Aclass();
	Bclass b = new Bclass();
	
	Deadlock() {
		Thread.currentThread().setName("MainThread");
		Thread t = new Thread(this, "RacingThread");
		t.start();
		
		a.foo(b);
		System.out.println("Back in main thread");
	}
	
	public void run() {
		b.bar(a);
		System.out.println("Back in other thread");
	}
	
	public static void main(String[] args) {
		new Deadlock();
	}

}
