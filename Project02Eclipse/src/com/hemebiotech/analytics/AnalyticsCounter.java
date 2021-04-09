package com.hemebiotech.analytics;

import com.hemebiotech.analytics.model.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.model.Symptom;
import com.hemebiotech.analytics.model.WriteSymptomDataToFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.hemebiotech.analytics.model.GenerateData.generateData;
import static com.hemebiotech.analytics.model.SortByType.*;

/**
 Main class of feature Analytics counter
 */
public class AnalyticsCounter {

	/**
	 Main method
	 @param args no param
	 @throws IOException impossible reading file raw data
	 */
	public static void main(String[] args) throws IOException {

		generateData(10000);

		ReadSymptomDataFromFile readData=new ReadSymptomDataFromFile("Project02Eclipse/dataTest.txt");

		List<Symptom> symptomList=readData.getSymptoms();

		if (!symptomList.isEmpty()) {
			Map<String, Integer> symptomMap=readData.sortSymptoms(symptomList);

			//symptomMap.forEach((symptom,quantity)-> System.out.println(symptom+" : "+quantity));
			sortByCardiac(symptomList);
			sortByVision(symptomList);
			sortByRespiratory(symptomList);
			sortByMuscular(symptomList);
			sortByGastric(symptomList);
			sortByPain(symptomList);
			sortByPsychological(symptomList);
			sortByGlobal(symptomList);


			WriteSymptomDataToFile writeData=new WriteSymptomDataToFile("result.out");
			writeData.writeDataFile(symptomMap);

		} else {
			System.out.println("opération annulée");
		}

	}


}
