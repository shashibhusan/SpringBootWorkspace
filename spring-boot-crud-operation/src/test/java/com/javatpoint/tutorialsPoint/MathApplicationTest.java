package com.javatpoint.tutorialsPoint;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MathApplicationTest {
	
	@Mock
	private CalculatorService calcService;
	
	private CalculatorService calcService1;
	
	@InjectMocks
	private MathApplication mathApplication;

	@Test
	void testAdd() {
		
		System.out.println("===="+Mockito.mockingDetails(calcService1).isMock());
		when(mathApplication.add(1.0d, 2.0d)).thenReturn(6.0d);
		assertEquals(6.0d, mathApplication.add(1.0d, 2.0d));
		verify(calcService).add(1.0d, 2.0d);
	}

	@Test
	void testSubtract() {
		double d=mathApplication.subtract(11.0d, 2.0d);
		assertNotNull(d);
	}

	@Test
	void testMultiply() {
		double d=mathApplication.divide(1.0d, 2.0d);
		assertNotNull(d);
	}

	@Test
	void testDivide() {
		double d=mathApplication.multiply(1.0d, 2.0d);
		assertNotNull(d);
	}

}
