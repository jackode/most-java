package chapter15.generics;//: generics/LimitsOfInference.java
import chapter14.typeinfo.pets.Person;
import chapter14.typeinfo.pets.Pet;

import java.util.*;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~
