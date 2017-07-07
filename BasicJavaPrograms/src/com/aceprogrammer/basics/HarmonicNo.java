package com.aceprogrammer.basics;

import java.io.Console;

public class HarmonicNo
{

	public static void main(String args[])
	{
	
	Console console = System.console();
	if(console == null)
	{
	System.exit(0);
	}
	else
	{
	System.out.println("Enter N upto which the Harmonic no is to be calculated.");
	String yearString = console.readLine();
	int n = Integer.parseInt(yearString);
	HarmonicGenerator(n);
	}
	} // main
	
	static void HarmonicGenerator(int n)
	{
	double sum = 0.0;
	for(int i = 1 ; i<=n ; i++)
	{
	sum = sum + 1.0 / i;	
	}
	
	System.out.println("The "+n+"th Harmonic number is "+sum);
	} // harmonicGenerator
}
