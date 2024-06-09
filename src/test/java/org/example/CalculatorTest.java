package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void calcTest1() {
    int res = Calculator.calc(1, 1, '+');
    Assertions.assertEquals(2, res);
  }

  @Test
  void calcTest2() {
    int res = Calculator.calc(1, 1, '-');
    Assertions.assertEquals(0, res);
  }

  @Test
  void calcTest3() {
    int res = Calculator.calc(5, 2, '*');
    Assertions.assertEquals(10, res);
  }

  @Test
  void calcTest4() {
    int res = Calculator.calc(100, 5, '/');
    Assertions.assertEquals(20, res);
  }

  @Test
  void calcTest5() {
    Assertions.assertThrows(ArithmeticException.class, () -> Calculator.calc(100, 0, '/'));
  }
}
