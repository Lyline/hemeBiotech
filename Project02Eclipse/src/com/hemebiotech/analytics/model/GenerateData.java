package com.hemebiotech.analytics.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GenerateData {

  public static void generateData(int entryNumber) throws IOException {
    String []data={"anxiety","arrhythmias","blindness","blurred vision","constricted pupils",
    "cough","dialated pupils","dizziness","dry mouth","fever","headache","high blood pressure",
        "inflamation","insomnia","low blood pressure","nausea","rapid heart rate","rash",
        "shortness of breath","stiff neck","stomach pain","tremor","water retention"};
    List<String> dataList=new ArrayList<>();

    for (int i=0;i<entryNumber;i++) {
      String entry=data[(int)(Math.random()*(data.length))];
      dataList.add(entry);
    }

    FileWriter writer=new FileWriter("Project02Eclipse/dataTest.txt");
    for (String symptom : dataList) {
      writer.write(symptom + "\n");
    }
    writer.close();
  }
}
