package com.hemebiotech.analytics.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 Class grouping all the static methods for sorts and prints results by type of symptom
 */
public class SortByType {
  /**
   Filters and prints symptoms of cardiac type (high blood pressure, low blood pressure, rapid heart rate, arrhythmias)
   @param symptomList List of raw data
   */
  public static void sortByCardiac(List<Symptom> symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Cardiac)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Cardiac Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  /**
   Filters and prints symptoms of vision type (blindness, blurred vision, constricted pupils, dialated pupils)
   @param symptomList List of raw data
   */
  public static void sortByVision(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Vision)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Vision Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  /**
   Filters and prints symptoms of respiratory type (cough, shortness of breath)
   @param symptomList List of raw data
   */
  public static void sortByRespiratory(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Respiratory)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Respiratory Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  /**
   Filters and prints symptoms of muscular type (tremor, stiff neck)
   @param symptomList List of raw data
   */
  public static void sortByMuscular(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Muscular)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Muscular Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  /**
   Filters and prints symptoms of gastric type (dry mouth, nausea, stomach pain)
   @param symptomList List of raw data
   */
  public static void sortByGastric(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Gastric)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Gastric Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  /**
   Filters and prints symptoms of pain type (headache, inflamation)
   @param symptomList List of raw data
   */
  public static void sortByPain(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Pain)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Pain Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  /**
   Filters and prints symptoms of psychological type (anxiety)
   @param symptomList List of raw data
   */
  public static void sortByPsychological(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Psychological)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Psychological Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  /**
   Filters and prints symptoms of global type (dizziness, fever, insomnia, rash, water retention)
   @param symptomList List of raw data
   */
  public static void sortByGlobal(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Global)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Global Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }
}
