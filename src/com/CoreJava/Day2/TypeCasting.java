package com.CoreJava.Day2;

public class TypeCasting {

	public static void main(String[] args)
	{
		/*
		 *  1.Primitive to primitive
		 *  ---------------------------
		 *  1.Implicit(Automatic)
		 *  2.Explicit(Manual)
		 */

		
		//implicit small size---->large size
		//byte-->short-->char-->int-->long-->float-->double
		
		byte b1=90;
		int i1=b1;
		System.out.println("byte to int conversion: "+i1);
		
		int i2=900;//4byte
		float f1=i2;//4byte
		System.out.println("int to float conversion: "+f1);
		
		int i3=89556788;
		long l1=i3;
		System.out.println("int to long conversion: "+l1);
		
		
		char ch='A';//2byte
		int i4=ch;//4byte
		System.out.println("char to int conversion: "+i4);
		
		
		long l2=998776L;//8byte
		float f2=l2;//4byte
		System.out.println("long to float conversion: "+f2);
		
		System.out.println("************************************");
		//Explicit-->casting operator() large size--->small size
		
		
		
		long l3=999999999L;
		int y=(int) l3;
		System.out.println("long to int conversion: "+y);
		
		int a=99;
		char ch2=(char)a;
		System.out.println("int to char explicit conversion: "+ch2);
		
		
		double d1=889.77655;
		int r=(int) d1;
		System.out.println("double to int explicit conversion: "+r);
		
		
		
		
	}

}
