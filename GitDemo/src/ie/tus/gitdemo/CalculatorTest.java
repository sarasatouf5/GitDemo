package ie.tus.gitdemo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
	 Calculator calculator = new Calculator();
	 int result = calculator.add(5, 3);
	 assertEquals(8, result);
	}

@Test
void testAddNegative() {
    Calculator calculator = new Calculator();

    int result = calculator.add(-2, 5);

    assertEquals(3, result);
}
@Test
void testSubtractPositive() {
    Calculator calculator = new Calculator();

    int result = calculator.subtract(10, 4);

    assertEquals(6, result);
}

@Test
void testSubtractNegative() {
    Calculator calculator = new Calculator();

    int result = calculator.subtract(3, 7);

    assertEquals(-4, result);
}

@Test
void testMultiplyPositive() {
    Calculator calculator = new Calculator();

    int result = calculator.multiply(4, 5);

    assertEquals(20, result);
}

@Test
void testMultiplyZero() {
    Calculator calculator = new Calculator();

    int result = calculator.multiply(8, 0);

    assertEquals(0, result);
}
}



