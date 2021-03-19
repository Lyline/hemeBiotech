package com.hemebiotech.analytics.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
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

	public Map<String,Integer> sortSymptoms(List<String> symptomList){
		Map<String, Integer> symptomMap = new TreeMap<>();

		for (String symptom : symptomList) {
			symptomMap.put(symptom,
					symptomMap.getOrDefault(symptom, 0) + 1);
		}
		return symptomMap;
	}
}
