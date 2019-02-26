package cse360assign2;

/**
 * This class acts as a calculator that can perform
 * addition, subtraction, multiplication, and division.
 * @author Andrei Larsen
 */
public class Calculator
{

	private int total;
	private String history;
	
	/**
	 * Constructor
	 */
	public Calculator ()
	{
		total = 0;
		history = "0";
	}
	
	/**
	 * Returns the total.
	 * @return the total
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * Adds the total with the parameter.
	 * @param value the parameter to add
	 */
	public void add (int value)
	{
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts the parameter from the total.
	 * @param value the parameter to subtract
	 */
	public void subtract (int value)
	{
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Multiplies the total by the parameter.
	 * @param value the parameter by which to multiply
	 */
	public void multiply (int value)
	{
		total *= value;
		history += " * " + value;
	}
	
	/**
	 * Divides the total by the parameter.
	 * Sets the result to zero if the parameter is zero.
	 * @param value the parameter by which to divide
	 */
	public void divide (int value)
	{
		if(value == 0)
			total = 0;
		else
			total /= value;
		history += " / " + value;
	}
	
	/**
	 * Returns a history of all of the operations that
	 * have been performed on this calculator object.
	 * @return A string representing the history
	 */
	public String getHistory ()
	{
		return history;
	}
}
