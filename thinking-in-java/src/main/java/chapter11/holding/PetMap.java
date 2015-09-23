package chapter11.holding;//: holding/PetMap.java
import chapter14.typeinfo.pets.Cat;
import chapter14.typeinfo.pets.Dog;
import chapter14.typeinfo.pets.Hamster;
import chapter14.typeinfo.pets.Pet;

import java.util.*;
import static chapter07.net.mindview.util.Print.*;

public class PetMap {
  public static void main(String[] args) {
    Map<String,Pet> petMap = new HashMap<String,Pet>();
    petMap.put("My Cat", new Cat("Molly"));
    petMap.put("My Dog", new Dog("Ginger"));
    petMap.put("My Hamster", new Hamster("Bosco"));
    print(petMap);
    Pet dog = petMap.get("My Dog");
    print(dog);
    print(petMap.containsKey("My Dog"));
    print(petMap.containsValue(dog));
  }
} /* Output:
{My Cat=Cat Molly, My Hamster=Hamster Bosco, My Dog=Dog Ginger}
Dog Ginger
true
true
*///:~
