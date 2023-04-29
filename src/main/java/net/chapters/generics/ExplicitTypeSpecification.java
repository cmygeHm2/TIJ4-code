package net.chapters.generics;//: generics/ExplicitTypeSpecification.java
import net.chapters.typeinfo.pets.Person;
import net.chapters.typeinfo.pets.Pet;
import net.mindview.util.New;
import net.chapters.typeinfo.pets.*;
import java.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
