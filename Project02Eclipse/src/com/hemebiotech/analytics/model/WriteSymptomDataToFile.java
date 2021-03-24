package com.hemebiotech.analytics.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 Creates a class for save and export data on a file .txt
 */
public class WriteSymptomDataToFile {
  String filePath;

  /**
   Constructs an object for store symptom's data
   @param filePath the filepath for create a new file of treated data
   */
  public WriteSymptomDataToFile(String filePath) {
    this.filePath = filePath;
  }

  /**
   Writes all treated data on a file
   @param symptomMap the map of sorted data
   */
  public void writeDataFile(Map<String, Integer> symptomMap) {
    try {
      FileWriter writer = new FileWriter(filePath);
      symptomMap.forEach((symptom, quantity) ->
      {
        try {
          writer.write(symptom + " : " + quantity + "\n");
        } catch (IOException e) {
          System.out.println("ecriture impossible - 1");
        }
      });
      writer.close();
    } catch (IOException e) {
      System.out.println("ecriture impossible");
    }
  }
}
