package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

public class AnalyticsCounter {

	public static void main(String[] args){
		/*
			lire mon fichier
			le contenu du fichier est stocké dans un tableau
			les données sont comptabilisées dans un HashMap
			le HashMap est trié par ordre A->Z
			exporter les données vers un fichier result.out
		*/
		ArrayList <String> symptomArray=new ArrayList<>();

		try {
			BufferedReader reader=new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
			String line=reader.readLine();

			while(line!=null){
				symptomArray.add(line);
				line=reader.readLine();
			}
			reader.close();

		} catch (FileNotFoundException e) {
			System.out.println("lecture impossible ou fichier introuvable");;
		} catch (IOException e) {
			System.out.println("pas de données à lire");
		}

		Map<String, Integer> symptomMap = new TreeMap();

		for (int i = 0; i < symptomArray.size(); i++) {
			symptomMap.put(symptomArray.get(i),
										 symptomMap.getOrDefault(symptomArray.get(i),0)+1);
		}

		symptomMap.forEach((symptom, quantity)-> System.out.println(symptom+" : "+quantity));

		try {
			FileWriter writer=new FileWriter("result.out");
			symptomMap.forEach((symptom, quantity)-> {
				try {
					writer.write(symptom+" : "+quantity+"\n");
				} catch (IOException e) {
					System.out.println("ecriture ligne impossible");
				}
			});
			writer.close();
		} catch (IOException e) {
			System.out.println("ecriture du fichier impossible");
		}
	}
}
