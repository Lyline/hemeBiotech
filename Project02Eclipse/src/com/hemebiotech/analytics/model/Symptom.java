package com.hemebiotech.analytics.model;

/**
 Creates an object of symptom
 */
public class Symptom {

  /**
   The name of the symptom
   */
  private String name;

  /**
   THe type of the symptom
   */
  private SymptomType type;

  /**
   Construct a symptom object
   @param name  the name of the symptom
   @param type  the type of the symptom
   */
  public Symptom(String name, SymptomType type) {
    this.name = name;
    this.type = type;
  }

  /**
   Gets the name of this symptom's object
   @return the name name of symptom
   */
  public String getName() {
    return name;
  }

  /**
   Gets the type of this symptom's object
   @return the type of the symptom
   */
  public SymptomType getType() {
    return type;
  }
}
