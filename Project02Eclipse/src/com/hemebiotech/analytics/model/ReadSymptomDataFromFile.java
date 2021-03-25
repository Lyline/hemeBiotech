package com.hemebiotech.analytics.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

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
	public List<Symptom> getSymptoms() {
		List<Symptom> result = new ArrayList<>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(addSymptomType(line));
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
	 Creates a symptom's object
	 @return Symptom object
	 */
	public Symptom addSymptomType(String element) {

		return switch (element) {
			case "high blood pressure", "low blood pressure", "rapid heart rate", "arrhythmias"
					-> new Symptom(element, SymptomType.Cardiac);
			case "blindness", "blurred vision", "constricted pupils", "dialated pupils"
					-> new Symptom(element, SymptomType.Vision);
			case "cough", "shortness of breath"
					-> new Symptom(element, SymptomType.Respiratory);
			case "tremor", "stiff neck"
					-> new Symptom(element, SymptomType.Muscular);
			case "dry mouth", "nausea", "stomach pain"
					-> new Symptom(element, SymptomType.Gastric);
			case "headache", "inflamation"
					-> new Symptom(element, SymptomType.Pain);
			case "anxiety"
					-> new Symptom(element, SymptomType.Psychological);
			case "dizziness", "fever", "insomnia", "rash", "water retention"
					-> new Symptom(element, SymptomType.Global);

			default-> new Symptom(element, null);
		};
	}

	/**
	 Sorts alphabetically the list of symptoms
	 @param symptomList list of all symptoms to sort
	 @return list of sorted symptoms
	 */
	public Map<String,Integer> sortSymptoms(List<Symptom> symptomList){
		Map<String, Integer> symptomMap = new TreeMap<>();

		for (Symptom symptom : symptomList) {
			symptomMap.put(symptom.getName(),symptomMap.getOrDefault(symptom.getName(), 0) + 1);
		}
		return symptomMap;
	}


}
