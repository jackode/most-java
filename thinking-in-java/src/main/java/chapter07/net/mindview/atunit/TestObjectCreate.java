//: net/mindview/atunit/TestObjectCreate.java
// The @Unit @TestObjectCreate tag.
package chapter07.net.mindview.atunit;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestObjectCreate {} ///:~
