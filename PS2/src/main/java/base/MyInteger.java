package base;

public class MyInteger
{
	private int iValue;
	
	public MyInteger(int userInputValue)
	{
		this.iValue = userInputValue;
	}
	
	public int getiValue()
	{
		return(this.iValue);
	}
	
	public boolean isEven()
	{
		return(this.iValue % 2 == 0);
	}
	
	public static boolean isEven(int integerInput)
	{
		return(integerInput % 2 == 0);
	}
	
	public boolean isOdd()
	{
		return(this.iValue % 2 == 1);
	}
	
	public static boolean isOdd(int integerInput)
	{
		return(integerInput % 2 == 1);
	}
	
	public boolean isPrime() //Runs through numbers and divides target numbers
	{
		boolean isPrime = true;
		for(int test = 2; test < this.iValue; test++)
		{
			if(this.iValue % test == 0)
			{
				isPrime = false; //If the target is divisible, break and set flag to false
				break;
			}
		}
			
		return(isPrime);
	}
	
	public static boolean isPrime(int integerInput)
	{
		boolean isPrime = true;
		for(int test = 2; test < integerInput; test++)
		{
			if(integerInput % test == 0)
			{
				isPrime = false;
				break;
			}
		}
			
		return(isPrime);
	}
	
	public boolean equals(int integerInput)
	{
		return(integerInput == this.iValue);
	}
	
	public boolean equals(MyInteger MyIntegerInput)
	{
		return(MyIntegerInput.iValue == this.iValue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
