package com.CoreJava.Array_String;

public class StringDemo2_Methods {

	/*
	 * String is collection of characters
	 * String is class in java
	 * String is immutable class in Java
	 * 
	 * Ways
	 * ===============
	 * 1.String using literal
	 * ===========================
	 * String objects creates inside jvm heap-->SCP(String constant pool)
	 * SCP  will not allowed duplicate objects
	 * 
	 * 2.String using new keyword
	 * ===========================
	 * It will create two object one inside heap area and one inside SCP
	 * 
	 * 
	 */
	public static void main(String[] args)
	{


		String s1="Hello All";
		
		//length()
		System.out.println("Length of string is: "+s1.length());
		
		//convert string to toUpperCase()  toLowerCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		/*
		 * string equality
		 * ======================
		 * 1.equals()
		 * 2.equalsIgnoreCase()
		 *  
		 */
		
		String s2="hello all";
		System.out.println(s1.equals(s2));//true-->false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		
		//search string- contains()
		String s3="Selenium WebDriver is an api for webui automation test";
		
		System.out.println("Search for api?: "+s3.contains("api"));//true
		System.out.println("search for testng: "+s3.contains("testng"));//false
		
		
		//startsWith(prefix)
		System.out.println("Strings starts with Selenium?: "+s3.startsWith("Selenium"));//true
		System.out.println("Strings starts with Sel?: "+s3.startsWith("Sel"));//true
		System.out.println("Strings starts with S?: "+s3.startsWith("S"));//true
		System.out.println("Strings starts with WebDriver?: "+s3.startsWith("WebDriver"));//false

		//endsWith(suffix)
		
		System.out.println("String ends with test?: "+s3.endsWith("test"));//true
		System.out.println("String ends with est?: "+s3.endsWith("est"));//true
		System.out.println("String ends with t?: "+s3.endsWith("t"));//true
		System.out.println("String ends with tool?: "+s3.endsWith("tool"));//false

		//trim() - ignore white space we use trim()
		String s4="     Welcome all      ";
		System.out.println(s4);
		
		System.out.println(s4.trim());
		
		//charAt(index)
		
		//s1="Hello All"
		
		System.out.println("Character at index 7: "+s1.charAt(7));//l
		
		//indexOf()
		System.out.println("index of charater l: "+s1.indexOf('l'));//2
		
		
		//concat()
		String s5="Welcome to learn OOP Priniciples!";
		
		System.out.println(s1.concat(" "+s5));
		System.out.println(s1+" "+s5);		
		
		
		
		//subtring
		System.out.println(s5.substring(11));
		
		System.out.println(s5.substring(11,20));
		
		
		System.out.println(s5);
		//replace
		System.out.println(s5.replace('l','*'));
		
		System.out.println(s5.replace("OOP","Selenium"));
		
		//split(regexp): regexp it is pattern matching
		
		String tools="Selenium,TestNG,PostMan,JMeter,Jira";
		System.out.println(tools);
		
		String arr[]=tools.split(",");
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		
		System.out.println(arr[2]);
		
		System.out.println(tools.split(",")[2]);
		/*
		 * test amount is 1000?
		 */
		
		String bill="Total amount to be pay is 1000";
		String amount=bill.split(" ")[6];
		
		//string to int
		int price=Integer.parseInt(amount);
		
		if(price==1000)
		{
			System.out.println("Amount is correct");
		}else
		{
			System.out.println("Amount is incorrect");
		
		}
		
		
		String s6="";
		String s7=" ";
		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		
		//toCharArray
	char arr1[]=s1.toCharArray();
	for(char i:arr1)
	{
		System.out.println(i);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
