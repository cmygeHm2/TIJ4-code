//: access/dessert/Cookie.java
// Creates a library.
package net.chapters.access.dessert;

public class Cookie {
  public Cookie() {
   System.out.println("Cookie constructor");
  }
  // originally this method is package-private (without "public" modifier)
  // but it was added just for successfully project building
  public void bite() { System.out.println("bite"); }
} ///:~
