package chapter15.generics;//: generics/ExplicitTypeSpecification.java
import chapter14.typeinfo.pets.Person;
import chapter14.typeinfo.pets.Pet;

import java.util.*;
import chapter07.net.mindview.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
