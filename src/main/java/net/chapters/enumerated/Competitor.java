//: enumerated/Competitor.java
// Switching one enum on another.
package net.chapters.enumerated;

public interface Competitor<T extends Competitor<T>> {
  Outcome compete(T competitor);
} ///:~
