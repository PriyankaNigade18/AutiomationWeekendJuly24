package com.CoreJava.Inheritance;


class A
{
	public void m1()
	{
		System.out.println("M1 is calling!");
	}
}


class B extends A//A is parent and B is child-Single level Inheritance
{
	public void m2()
	{
		System.out.println("M2 is calling!");
	}
}


class C extends B//B is parent and C is child- Multi level Inheritance
{
	public void m3()
	{
		System.out.println("M3 is calling!");
	}
}

class D extends A//A is parent for D- Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("M4 is calling!");
	}
}

//class Y extends B,D
//{
//	
//}
public class InheritanceDemo1 {

	public static void main(String[] args)
	{
		System.out.println("Scenario1: child class ref and child class Object-->Parent+child" );
		
		System.out.println("Single Level A--B");
		B b1=new B();
		b1.m1();//inherited
		b1.m2();//individual
		
		System.out.println("Multi level--->A--B--C");
		C c1=new C();
		c1.m1();//inherited
		c1.m2();//inherited
		c1.m3();//individual
		
		System.out.println("Hierarchical Inherited --->child is D for Parent A");
		D d1=new D();
		d1.m1();//inherited
		d1.m4();//individual
		
		System.out.println("Scenario2: parent class ref and parent class Object-->Parent" );
		A a1=new A();
		a1.m1();//individual
		
		System.out.println("Multi level B is parent for C");
		B b3=new B();
		b3.m1();//inherited
		b3.m2();//individual
		
		System.out.println("Scenario3: Parent class ref and child class Object-->Parent" );
		A a2=new B();
		a2.m1();//individual
		
		System.out.println("Multi level B is parent for C");
		B b4=new C();
		b4.m1();//inherited
		b4.m2();//individual

		System.out.println("Hierarchical Inheritance");
		
		A a3=new D();
		a3.m1();//individual
		
		System.out.println("Scenario4: child class ref and Parent class Object-->Invalid" );
		
		//B b2=new A();
		

		
		
		
		
		
		
		


		
		
		
		
		
		
		
		

	}

}
