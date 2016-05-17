package com.fuck.thread;

public class Test {

	public static void main(String[] args) {
		Thread a = new TaskA();
		a.start();
		
		

	}

}

class TaskA extends Thread{
	public void run(){
		System.out.println("task A");
		Thread b = new TaskB();
		b.start();
	}
}


class TaskB extends Thread{
	public void run(){
		System.out.println("task B");
	}
}
