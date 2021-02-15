package com.xworkz.dth.service;

public class Dth extends Object{
	private int price;
	private int noOfPorts;
	private String subscriberId;
	private String subcription;
	private int maxChannel;
	private boolean isHdSupported;

	
	protected Dth(){
		
	}
	protected void connectionName() {
		System.out.println("invoked connection");

	}

	protected void updateSoftware() {
		System.out.println(" your dth is updated");
		this.patch();

	}

	private void patch()
	{
		System.out.println("patching in dth");
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfPorts() {
		return noOfPorts;
	}

	public void setNoOfPorts(int noOfPorts) {
		this.noOfPorts = noOfPorts;
	}

	public String getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getSubcription() {
		return subcription;
	}

	public void setSubcription(String subcription) {
		this.subcription = subcription;
	}

	public int getMaxChannel() {
		return maxChannel;
	}

	public void setMaxChannel(int maxChannel) {
		this.maxChannel = maxChannel;
	}

	public boolean isHdSupported() {
		return isHdSupported;
	}

	public void setHdSupported(boolean isHdSupported) {
		this.isHdSupported = isHdSupported;
	}
}
