package com.hemebiotech.analytics.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByType {
  public static void sortByCardiac(List<Symptom> symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Cardiac)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Cardiac Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  public static void sortByVision(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Vision)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Vision Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  public static void sortByRespiratory(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Respiratory)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Respiratory Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  public static void sortByMuscular(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Muscular)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Muscular Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  public static void sortByGastric(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Gastric)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Gastric Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  public static void sortByPain(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Pain)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Pain Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  public static void sortByPsychological(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Psychological)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Psychological Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }

  public static void sortByGlobal(List<Symptom>symptomList){
    Map<String,Long> map=symptomList.stream()
        .filter(s->s.getType()==SymptomType.Global)
        .collect(Collectors.groupingBy(Symptom::getName,Collectors.counting()));

    System.out.println("--- Global Symptom ---");
    map.forEach((s, aLong) -> System.out.println(s+" : "+aLong));
    System.out.println("-----------------------\n");
  }
}
