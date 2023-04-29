package net.chapters.generics;//: generics/SimplerPets.java
import net.chapters.typeinfo.pets.Person;
import net.chapters.typeinfo.pets.Pet;
import net.mindview.util.New;
import net.chapters.typeinfo.pets.*;
import java.util.*;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
