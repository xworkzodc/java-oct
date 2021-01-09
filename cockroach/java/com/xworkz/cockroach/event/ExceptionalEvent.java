package com.xworkz.cockroach.event;

public class ExceptionalEvent {

	public ExceptionalEvent() {
		System.out.println("Created ExceptionalEvent");
	}

	private void createExceptionalEvent(boolean create) throws Throwable {
		System.out.println("invoked createExceptionalEvent");
		if (create) {
			System.out.println("creating exceptional event");
			Throwable throwable = new Throwable("sumne creating , bere kelsa illa");
			throw throwable;
		} else {
			System.out.println("no exceptional event");
		}
	}

	public void frame1()throws Throwable {
		System.out.println("frame1");
		this.frame2();
	}

	public void frame2()throws Throwable {
		System.out.println("frame2");
		this.frame3();
	}

	public void frame3()throws Throwable {
		System.out.println("frame3");
		this.frame4();
	}
	
	public void frame4() throws Throwable {
		System.out.println("frame4");
		this.createExceptionalEvent(true);
	}
}
