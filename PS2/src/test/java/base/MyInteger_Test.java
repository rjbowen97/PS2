package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEvenTrue()
	{
		int MyIntegerTestValue = 2;
		MyInteger testMyInteger = new MyInteger(MyIntegerTestValue);
		boolean expectedResult = true;
		boolean realResult = testMyInteger.isEven();
		assertEquals("testIsEvenTrue() failed",expectedResult,realResult);
	} 
	
	@Test
	public void testIsEvenFalse()
	{
		int MyIntegerTestValue = 3;
		MyInteger testMyInteger = new MyInteger(MyIntegerTestValue);
		boolean expectedResult = false;
		boolean realResult = testMyInteger.isEven();
		assertEquals("testIsEvenFalse() failed",expectedResult,realResult);
	}
	
	@Test
	public void testIsOddTrue()
	{
		int MyIntegerTestValue = 3;
		MyInteger instance = new MyInteger(MyIntegerTestValue);
		boolean expectedResult = true;
		boolean realResult = instance.isOdd();
		assertEquals("testIsOddTrue() failed",expectedResult,realResult);
	}
	
	@Test
	public void testIsOddFalse()
	{
		int MyIntegerTestValue = 2;
		MyInteger instance = new MyInteger(MyIntegerTestValue);
		boolean expectedResult = false;
		boolean realResult = instance.isOdd();
		assertEquals("testIsOddFalse() failed",expectedResult,realResult);
	}
	
	@Test
	public void testGetiValue()
	{
		int MyIntegerTestValue = 3;
		MyInteger instance = new MyInteger(MyIntegerTestValue);
		int expectedResult = 3;
		int realResult = instance.getiValue();
		assertEquals("testGetiValue() failed",expectedResult,realResult);
	}
	
	@Test
	public void testStaticIsEvenTrue()
	{
		int MyIntegerTestValue = 2;
		boolean expectedResult = true;
		boolean realResult = MyInteger.isEven(MyIntegerTestValue);
		assertEquals("testStaticIsEvenTrue() failed",expectedResult,realResult);
	}
	
	@Test
	public void testStaticIsEvenFalse()
	{
		int MyIntegerTestValue = 3;
		boolean expectedResult = false;
		boolean realResult = MyInteger.isEven(MyIntegerTestValue);
		assertEquals("testStaticIsEvenFalse() failed",expectedResult,realResult);
	}
	
	@Test
	public void testStaticIsOddTrue()
	{
		int MyIntegerTestValue = 3;
		boolean expectedResult = true;
		boolean realResult = MyInteger.isOdd(MyIntegerTestValue);
		assertEquals("testStaticIsOddTrue() failed",expectedResult,realResult);
	}
	
	@Test
	public void testStaticIsOddFalse()
	{
		int MyIntegerTestValue = 2;
		boolean expectedResult = false;
		boolean realResult = MyInteger.isOdd(MyIntegerTestValue);
		assertEquals("testStaticIsOddFalse() failed",expectedResult,realResult);
	}
	
	@Test
	public void testIsPrimeTrue()
	{
		int MyIntegerTestValue = 7;
		MyInteger testMyInteger = new MyInteger(MyIntegerTestValue);
		boolean expectedResult = true;
		boolean realResult = testMyInteger.isPrime();
		assertEquals("testIsPrimeTrue() failed",expectedResult,realResult);
	}
	
	@Test
	public void testIsPrimeFalse()
	{
		int MyIntegerTestValue = 8;
		MyInteger testMyInteger = new MyInteger(MyIntegerTestValue);
		boolean expectedResult = false;
		boolean realResult = testMyInteger.isPrime();
		assertEquals("testIsPrimeFalse() failed",expectedResult,realResult);
	}
	
	@Test
	public void testStaticIsPrimeTrue()
	{
		int MyIntegerTestValue = 7;
		boolean expectedResult = true;
		boolean realResult = MyInteger.isPrime(MyIntegerTestValue);
		assertEquals("testStaticIsPrimeTrue() failed",expectedResult,realResult);
	}
	
	@Test
	public void testStaticIsPrimeFalse()
	{
		int MyIntegerTestValue = 8;
		boolean expectedResult = false;
		boolean realResult = MyInteger.isPrime(MyIntegerTestValue);
		assertEquals("testStaticIsPrimeFalse() failed",expectedResult,realResult);
	}
	
	@Test
	public void testEqualTrue()
	{
		int MyIntegerTestValue = 8;
		MyInteger testMyInteger = new MyInteger(MyIntegerTestValue);
		boolean expectedResult = true;
		boolean realResult = testMyInteger.equals(MyIntegerTestValue);
		assertEquals("testEqualTrue() failed",expectedResult,realResult);
	}
	
	@Test
	public void testEqualFalse()
	{
		int MyIntegerTestValue = 8;
		MyInteger testMyInteger = new MyInteger(7);
		boolean expectedResult = false;
		boolean realResult = testMyInteger.equals(MyIntegerTestValue);
		assertEquals("testEqualFalse() failed",expectedResult,realResult);
	}
	
	@Test
	public void testEqualTrueObject()
	{
		MyInteger testMyInteger = new MyInteger(7);
		MyInteger testMyIntegerTwo = new MyInteger(8);
		boolean expectedResult = true;
		boolean realResult = testMyInteger.equals(testMyInteger);
		assertEquals("testEqualTrueObject() failed",expectedResult,realResult);
	}
	
	@Test
	public void testEqualFalseObject()
	{
		MyInteger testMyInteger = new MyInteger(7);
		MyInteger testMyIntegerTwo = new MyInteger(8);
		boolean expectedResult = false;
		boolean realResult = testMyInteger.equals(testMyIntegerTwo);
		assertEquals("testEqualFalseObject() failed",expectedResult,realResult);
	}
	
}
