//: interfaces/interfaceprocessor/Apply.java
package chapter09.interfaces.interfaceprocessor;
import static chapter07.net.mindview.util.Print.*;

public class Apply {
  public static void process(Processor p, Object s) {
    print("Using Processor " + p.name());
    print(p.process(s));
  }
} ///:~
