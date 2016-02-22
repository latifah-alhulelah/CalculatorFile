package cse360assign3;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author latifah alhulelah
 *
 */
public class CalculatorTest {
	
	@Test
	public void testCalculator()
	{
		Calculator calculator1 = new Calculator();
		assertNotNull(calculator1);	
	}
	
	@Test
	public void testGetTotal()
	{
		Calculator calculator1 = new Calculator();
		assertEquals(0,calculator1.getTotal());
		
		calculator1.add(5);
		assertEquals(5,calculator1.getTotal());
		
		calculator1.add(3);
		calculator1.subtract(1);
		assertEquals(7,calculator1.getTotal());
		
	}
	
	@Test
	public void testAdd()
	{
		Calculator calculator1 = new Calculator();
		calculator1.add(3);
		calculator1.add(2);
		calculator1.add(8);
		calculator1.add(5);
		calculator1.add(1);
		assertEquals(19,calculator1.getTotal());
	}
	
	@Test
	public void testSubtract()
	{
		Calculator calculator1 = new Calculator();
		calculator1.add(10);
		calculator1.subtract(2);
		calculator1.subtract(1);
		calculator1.subtract(3);
		assertEquals(4, calculator1.getTotal());
	}
	
	@Test
	public void testMultiply()
	{
		Calculator calculator1 = new Calculator();
		calculator1.add(1);
		calculator1.multiply(2);
		calculator1.multiply(4);
		assertEquals(8, calculator1.getTotal());
	}
	
	@Test
	public void testDivide()
	{
		Calculator calculator1 = new Calculator();
		calculator1.add(30);
		calculator1.divide(3);
		calculator1.divide(2);
		assertEquals(5, calculator1.getTotal());
		
		calculator1.divide(0);
		assertEquals(0,calculator1.getTotal());
	}
	
	@Test
	public void testGetHistory()
	{
		Calculator calculator1 = new Calculator();
		calculator1.add(1);
		calculator1.multiply(2);
		calculator1.subtract(1);
		assertEquals("0 + 1 * 2 - 1", calculator1.getHistory());
	}
	
	
}
