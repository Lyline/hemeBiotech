package com.hemebiotech.analytics;

import com.hemebiotech.analytics.model.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.model.WriteSymptomDataToFile;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String[] args) {

			ReadSymptomDataFromFile readData=new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

			List<String> symptomList=readData.getSymptoms();

		if (!symptomList.isEmpty()) {
			Map<String, Integer> symptomMap=readData.sortSymptoms(symptomList);

			symptomMap.forEach((symptom, quantity)-> System.out.println(symptom+" : "+quantity));

			WriteSymptomDataToFile writeData=new WriteSymptomDataToFile("result.out");
			writeData.writeDataFile(symptomMap);
		} else {
			System.out.println("opération annulée");
		}


	}


}
