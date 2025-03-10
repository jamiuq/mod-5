import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test
{
  @Test
  void testAddition() {
    Example1 t = new Example1();
    assertEquals(4, t.Addition(2, 2));
  }
}
/*
This class tests Example1's Addition method.
In this case it makes sure Addition(2, 2) returns 4.
*/