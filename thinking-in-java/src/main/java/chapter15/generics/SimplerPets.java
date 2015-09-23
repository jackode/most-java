package chapter15.generics;//: generics/SimplerPets.java
import chapter14.typeinfo.pets.Person;
import chapter14.typeinfo.pets.Pet;

import java.util.*;
import chapter07.net.mindview.util.*;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
