package com.aceprogrammer.basics;

public class VendingMachine {
	
	static int[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
	static int[] noteQuantiy = new int[coins.length];
	
	public static void main(String args[]) {
		
		int sum = 854;
		VendingMachine minCoin = new VendingMachine();
		System.out.println("Total no of notes required:"+minCoin.findMinCoins(coins, sum));
		for (int i = 0; i < coins.length; i++) {
			if(noteQuantiy[i] > 0)
			System.out.printf("%d notes of %d Rs. \n", noteQuantiy[i], coins[i]);
			
		}
	}
		
		// Assume coin array is sorted. if not sort the array first.
		private int findMinCoins(int[] coins, int sum) {
		// base case
		if (sum <= 0 || coins.length == 0) {
		return 0;
		}

//		for (int i = coins.length - 1; i >= 0; i--) {
//		if (coins[i] <= sum) {
//		return 1 + findMinCoins(coins, sum - coins[i]);
//		}
//		}
		
		for (int i = coins.length - 1; i >= 0; i--) {
			if (coins[i] <= sum) {
				noteQuantiy[i]= sum/coins[i] ; 
			return sum/coins[i] + findMinCoins(coins, sum%coins[i]);
			}
			}
		return 0;
		}


}
