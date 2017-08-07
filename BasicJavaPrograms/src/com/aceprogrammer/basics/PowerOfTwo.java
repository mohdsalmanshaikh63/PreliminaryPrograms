package com.aceprogrammer.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.aceprogrammer.basics.utilities.MyUtilities;

public class PowerOfTwo {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Let's play with the power of 2");
		System.out.println("Enter the powers upto which you want to play ( -31 < n < 31)");

		int n = Integer.parseInt(br.readLine());
		while (!(n < -31) && (n > 31))
		{
			System.out.println("Please enter a no between the specified range");
			n = Integer.parseInt(br.readLine());
		}
		MyUtilities.powerOfTwo(n);
	}
}

