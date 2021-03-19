package com.hemebiotech.analytics.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile {
  String filePath;

  public WriteSymptomDataToFile(String filePath) {
    this.filePath = filePath;
  }

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
