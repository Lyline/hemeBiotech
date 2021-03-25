package com.hemebiotech.analytics.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Reads and sorts symptoms from a file input
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * Constructs an object for read symptom's data
	 * @param filepath the filepath for read a raw data's file
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 Reads and adds all symptom from file on a list
	 @return a symptom's list
	 */
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				System.out.println("Lecture du fichier impossible");
			}
		}
		return result;
	}

	/**
	 Sorts alphabetically the list of symptoms
	 @param symptomList list of all symptoms to sort
	 @return list of sorted symptoms
	 */
	public Map<String,Integer> sortSymptoms(List<String> symptomList){
		Map<String, Integer> symptomMap = new TreeMap<>();

		for (String symptom : symptomList) {
			symptomMap.put(symptom,symptomMap.getOrDefault(symptom, 0) + 1);
		}
		return symptomMap;
	}
}
