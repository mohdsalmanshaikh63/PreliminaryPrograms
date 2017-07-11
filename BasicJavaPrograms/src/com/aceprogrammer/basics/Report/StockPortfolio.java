package com.aceprogrammer.basics.Report;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {

	List<Stock> stockList;
	
	public StockPortfolio() throws FileNotFoundException, IOException
	{
		stockList = new ArrayList<>();
		
		
		// check the system.getProperty(user.dir) in case of errors
		try(BufferedReader br = new BufferedReader(new FileReader("src/resources/StockInfo.txt")))
		{
			
			// read each stock line by line and add them to the arraylist
			
			String line;
			while((line = br.readLine()) != null )
			{							
				Stock stock = readStock(line);
				stockList.add(stock);
			}
			
		}
	}
	
	public Stock readStock(String s)
	{
		String[] stock = s.split(", ");
		String name = stock[0];
		float price = Float.parseFloat(stock[1]);
		int quantity = Integer.parseInt(stock[2]);
		
		return new Stock(name, quantity, price);
	}
	
	public List<Stock> getStockPortfolios()
	{		
			return stockList;
	}
	
	
}
