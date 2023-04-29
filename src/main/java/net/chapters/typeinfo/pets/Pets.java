//: typeinfo/pets/Pets.java
// Facade to produce a default PetCreator.
package net.chapters.typeinfo.pets;
import net.chapters.typeinfo.pets.LiteralPetCreator;
import net.chapters.typeinfo.pets.PetCreator;

import java.util.*;

public class Pets {
  public static final PetCreator creator =
    new LiteralPetCreator();
  public static Pet randomPet() {
    return creator.randomPet();
  }
  public static Pet[] createArray(int size) {
    return creator.createArray(size);
  }
  public static ArrayList<Pet> arrayList(int size) {
    return creator.arrayList(size);
  }
} ///:~
