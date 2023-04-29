package net.chapters.generics;//: generics/LimitsOfInference.java
import net.chapters.typeinfo.pets.Person;
import net.chapters.typeinfo.pets.Pet;
import net.chapters.typeinfo.pets.*;
import java.util.*;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~
