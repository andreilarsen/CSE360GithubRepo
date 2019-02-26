package cse360assign2;

public class Main
{
	public static void main(String args[])
	{
		Calculator myCalc = new Calculator();
		myCalc.add(10);
		myCalc.add(4);
		myCalc.subtract(17);
		myCalc.multiply(12);
		myCalc.add(300);
		myCalc.divide(31);
		myCalc.subtract(9);
		myCalc.divide(0);
		myCalc.add(89);
		System.out.println(myCalc.getHistory());
	}
}
