package net.chapters.holding;//: holding/PetMap.java
import net.chapters.typeinfo.pets.Cat;
import net.chapters.typeinfo.pets.Dog;
import net.chapters.typeinfo.pets.Hamster;
import net.chapters.typeinfo.pets.Pet;
import net.chapters.typeinfo.pets.*;
import java.util.*;

import static net.mindview.util.Print.print;

public class PetMap {
  public static void main(String[] args) {
    Map<String, Pet> petMap = new HashMap<String,Pet>();
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
