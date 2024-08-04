package com.CoreJava.Day2;

public class OperatorsInJava {

	public static void main(String[] args) 
	{
		System.out.println("******Arithemetic Operators**********");

		int a=20,b=10;
		//System.out.println("Addition is: "+a+b);
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Modulus is: "+(a%b));
		
		
		/*
		 * Unary Operators
		 * 
		 * ++ (Increment)        --(decrement)
		 * 
		 * a=20
		 * a++ (Post increment)
		 * ++a (pre increment)
		 * 
		 * a++ =  a=a+1
		 * 
		 * 
		 */
		int a1=90;
		System.out.println(a1);//90
		System.out.println(++a1);//91
		
		int a2=90;
		System.out.println(a2);//90
		System.out.println(a2++);//90
		System.out.println(a2);//91
		
		int b1=100;
		int c1=b1++;
		System.out.println(b1);//101
		System.out.println(c1);//100
		
		
		int b2=678;
		int c2=b2++;
		System.out.println(c2);//678
		System.out.println(b2);//679
		
		
		int b3=58;
		int c3=++b3;
		System.out.println(b3);
		System.out.println(c3);
		
		
		int k=89;
		int y=k++;
		System.out.println(y);//89
		System.out.println(k);//90
		
		
		int h=3879;
		int j=++h;
		System.out.println(h);//3880
		System.out.println(j);//3880
		
		/*
		 * Decrement
		 *   a--  post
		 *   --a pre    a=a-1
		 */
		int q=78;
		System.out.println(q);//78
		System.out.println(q--);//78
		System.out.println(q);//77
		
		int u=45;
		System.out.println(u);//45
		System.out.println(--u);//44
		
		int p=789;
		int s=p--;
		System.out.println(s);//789
		System.out.println(p);//788
		
		
		int o=30;
		int t=--o;
		
		System.out.println(t);//29
		System.out.println(o);//29
		
		System.out.println("***********Relational Operator****************");
		//t=o=29 u=44 q=77 a1=a2=91
		System.out.println("Less than <: "+(u<a1));//true
		System.out.println(a2<o);//false
		System.out.println("Greater than >: "+(a2>t));//true
		System.out.println("Greater than equal to: "+(a1>=a2));//true
		System.out.println("less than equal to: "+(a1<=a2));//true
		System.out.println("Equal To ==: "+(t==o));//true
		System.out.println(t==a1);//false
		System.out.println("Not equal to !=: "+(q!=u));//true
		System.out.println(a1!=a2);//false
		
		System.out.println("***********Logical Operator****************");

		/*
		 *  a   b   a&&b(And)   a||b(Or)    !a(Not)
		 *  T   T     T          T			F
		 *  T   F     F          T   		F
		 *  F   T     F          T			T
		 *  F   F     F          F			T
		 * 
		 */
		
		System.out.println(u<a1 && a1==a2);//true
		System.out.println(a1<u && a1==a2);//false
		System.out.println(a1!=o && t!=o);//false
		System.out.println(u==q && a1>a2);//false
		
		System.out.println("*****Or************");
		System.out.println(u<a1 || a1==a2);//true
		System.out.println(a1<u || a1==a2);//true
		System.out.println(a1!=o || t!=o);//true
		System.out.println(u==q || a1>a2);//false
		
		
		//Not
		
		System.out.println(a1==a2);//true
		System.out.println(!(a1==a2));//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
