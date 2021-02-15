package com.xworkz.celebration;

public class ThreadTester {

	public static void main(String[] args) {



		Thread thread = new Thread(()-> {

			for (int i = 0; i <= 5; i++) {
				try {
					Thread.sleep(3000);
					System.out.println("invoked run");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		});
		thread.start();
		
		MyThread myThread=new MyThread();
		myThread.start();
		//Daemon thread , sync , sync block 
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(3000);
				System.out.println("running main");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
