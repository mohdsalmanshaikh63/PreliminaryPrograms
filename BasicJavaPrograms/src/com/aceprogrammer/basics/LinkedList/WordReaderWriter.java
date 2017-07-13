package com.aceprogrammer.basics.LinkedList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordReaderWriter {
	
	private List<String> listOfWords;

	
	public List<String> getWordList(String filePath) throws IOException
	{
		listOfWords = new ArrayList<>();
		Path path = Paths.get(filePath);
		
		// new magical api from java 7
		List<String> lines = Files.readAllLines(path);
		
		// process each line and add it to our listOfWords
		for(String line: lines)
		{
			String[] words = line.split(" ");
			listOfWords.addAll(Arrays.asList(words));
		}
		
		return listOfWords;
		
	}
	
	public void writeWordList(List<String> wordList, String filePath) throws IOException
	{
		// magic of Java 7 Files
		
		Path path = Paths.get(filePath);
		Files.write(path, wordList);
	}
	
}
