package com.yun.myapp;

public class Bclass {
	synchronized void bar(Aclass a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered Bclass.bar");
		
		try{
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Bclass Interrupted");
		}
		
		System.out.println(name + " trying to call Aclass.last");
		a.last();
	}
	
	synchronized void last() {
		System.out.println("Inside Aclass.last");
	}
}
