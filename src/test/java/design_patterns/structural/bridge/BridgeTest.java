package design_patterns.structural.bridge;

import org.junit.*;

public class BridgeTest {

  @Test
  public void mainTest() {
    Shape[] shapes = new Shape[]{
        new Circle(new DrawProgram1()),
        new Circle(new DrawProgram2()),
        new Line(new DrawProgram1()),
        new Line(new DrawProgram2())
    };

    for (Shape shape : shapes) {
      System.out.println(shape.draw());
    }
  }
}
