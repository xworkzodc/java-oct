package com.xworkz.basics.pocket;

public class ArrayCrud {
	
	
private String[] emails=new String[100];
private int lastIndex=0;

public void addNewEmail(String newEmail)
{
    if(!newEmail.isEmpty())
    {
    	if(lastIndex<100)
    	{
    	this.emails[lastIndex]=newEmail;
    	lastIndex++;
    	}
    }
}

}
