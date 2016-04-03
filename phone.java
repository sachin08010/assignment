package com.acadgild;

public class phone {

	static String name;
	static String type;
	
	
	public phone(String n1, String t1)
	{
		name=n1;
		type=t1;
	}
	public void calling()
	{
		System.out.println("Calling... " + name);
	}
	public void SendingSMS()
	{
		System.out.println("Sending SMS to ... " + name);
	}
	

	public static void main(String[] args) {
		phone p1= new phone("Sachin","Home");
		
		p1.calling();
		p1.SendingSMS();
		
		phone p2= new phone("Manoj","Home");
		
		p1.calling();
		p1.SendingSMS();
		
		phone p3= new phone("Ashu","Home");
		
		p1.calling();
		p1.SendingSMS();
		
		phone p4= new phone("Rajesh","Home");
		
		p1.calling();
		p1.SendingSMS();
		
		//System.out.println(p1.name);
		
				
	}

}
