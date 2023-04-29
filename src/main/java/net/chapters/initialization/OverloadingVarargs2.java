package net.chapters.initialization;//: initialization/OverloadingVarargs2.java
// {CompileTimeError} (Won't compile)

public class OverloadingVarargs2 {
  static void f(float i, Character... args) {
    System.out.println("first");
  }
  static void f(Character... args) {
    System.out.print("second");
  }
  public static void main(String[] args) {
    f(1, 'a');
//     java: reference to f is ambiguous
//     both method f(float,java.lang.Character...) in n.c.i.OverloadingVarargs2 and method f(java.lang.Character...) in n.c.i.OverloadingVarargs2 match
//     f('a', 'b');
  }
} ///:~
