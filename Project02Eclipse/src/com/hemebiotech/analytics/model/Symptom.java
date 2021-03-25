package com.hemebiotech.analytics.model;

public class Symptom {
  String name;
  SymptomType type;

  public Symptom(String name, SymptomType type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public SymptomType getType() {
    return type;
  }
}
