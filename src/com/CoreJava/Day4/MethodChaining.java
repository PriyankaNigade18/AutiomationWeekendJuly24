package com.CoreJava.Day4;

public class MethodChaining 
{
	/*For builder pattern method has to return current class object
	 * 
	 * 
	 */
	//method to object
	public MethodChaining startApp()
	{
		System.out.println("Application is started!");
		//this.runApp();
		return this;
		
	}

	public MethodChaining runApp()
	{
		System.out.println("Application is runnig!");
		return this;
	}
	
	public MethodChaining stopApp()
	{
		System.out.println("Application is stoped!");
		return this;
	}
	public static void main(String[] args) 
	{
		MethodChaining obj=new MethodChaining();
		obj.startApp().runApp().stopApp();
		
		
		
		
		
		
//		obj.runApp();
//		obj.stopApp();

	}

}
