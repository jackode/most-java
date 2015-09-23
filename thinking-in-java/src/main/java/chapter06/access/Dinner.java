package chapter06.access;//: access/Dinner.java
// Uses the library.

import chapter06.access.dessert.Cookie;

public class Dinner {
  public static void main(String[] args) {
    Cookie x = new Cookie();
    //! x.bite(); // Can't access
  }
} /* Output:
Cookie constructor
*///:~
