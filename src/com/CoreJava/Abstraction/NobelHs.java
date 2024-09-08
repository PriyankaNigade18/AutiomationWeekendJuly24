package com.CoreJava.Abstraction;

public class NobelHs implements IMA,USMA
{

	
	public void medical()
	{
		System.out.println("NobelHs.....Medicalservice()");
	}

	@Override
	public void cardio() {
		System.out.println("NobelHs.....Cardio()");
		
	}

	@Override
	public void physio() {
		System.out.println("NobelHs.....Physio()");
		
	}

	@Override
	public void nero() {

		System.out.println("NobelHs.....nero()");

		
	}

	@Override
	public void dental() {
		System.out.println("NobelHs....dental()");

	}

	@Override
	public void covid19Test() {
		System.out.println("NobelHs....Covid19Test");
		
	}
}
