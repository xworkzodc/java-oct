package com.xworkz.exceptions;

public class EventCreator {

	public EventCreator() {
		System.out.println("Created EventCreator");
	}

	public void createEvent(boolean create) throws Throwable {
		if (create) {
			System.out.println("creating exception event");
			Throwable throwable = new Throwable();
			String event = "something";
			throw throwable;// obf og throwable or any child obj of throwbale
		} else {
			System.out.println("not creating exception event");
		}
	}

	public void frame1() throws Throwable{
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

	public void frame4()throws Throwable {
		System.out.println("frame4");
		this.frame5();
	}

	public void frame5()throws Throwable {
		System.out.println("frame5");
		this.createEvent(Boolean.TRUE);
	}
	
	public void createException() throws Exception
	{
		Exception ref=new Exception();
		throw ref;
	}
	
	public void createRunTimeException()
	{
		RuntimeException exception=new RuntimeException();//problem with your code
		throw exception;
	}
	
	public void createError()
	{
		Error error=new Error();//StackOverFlow
		throw error;
	}
}





