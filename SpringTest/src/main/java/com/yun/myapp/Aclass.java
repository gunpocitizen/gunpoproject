package com.yun.myapp;

public class Aclass {
	synchronized void foo(Bclass b) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " entered Aclass.foo");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Aclass Interrupted");
		}
		
		System.out.println(name + " trying to call Bclass.last()");
		b.last();
	}
	
	synchronized void last() {
		System.out.println("Inside Aclass.last");
	}
}
