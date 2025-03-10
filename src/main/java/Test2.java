import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test2
{
  @Test
  void testMultiplication() {
    Example2 t = new Example2();
    assertEquals(6, t.Multiplication(3, 2));
  }
}
/*
This class tests Example2's Multiplication method.
In this case it makes sure Multiplication(3, 2) returns 6.
*/