package com.aceprogrammer.basics;

import java.util.Random;
import java.io.Console;

public class CoinFlip
{
	public static void main(String args[])
	{
	Random random = new Random();
	int head = 0;
	int tail = 0;
	int coin = 0;
	float n = 0F	;
	float hfrequency = 0F;
	float tfrequency = 0F;
	Console console = System.console();
	if(console == null)
	{
	System.exit(0);
	}
	else
	{
	System.out.println("Let's have some fun tossing coins");
	System.out.println("FYI H will denote heads and T will denote tails");
	System.out.println("Enter the no of times you want to flip the coin:");
	n = Integer.parseInt(console.readLine());
	System.out.println("Let's flip the coin for "+n+" times");
	for(int i = 1; i <= n; i++)
	{
	coin = Math.round(random.nextFloat());
	if(coin == 0)
	{
	System.out.print("H");
	head++;
	}
	else
	{
	System.out.print("T");
	tail++;
	}

	}
	hfrequency = head/n;
	tfrequency = tail/n;
	System.out.println("Head frequency(%): "+hfrequency+"%");
	System.out.println("Tail frequency(%): "+tfrequency+"%");
	}
	}
	}
	
	
