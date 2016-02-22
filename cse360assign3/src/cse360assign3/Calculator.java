package cse360assign3;

public class Calculator {

	private int total;
	private String actionsHistory;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		actionsHistory = "" + 0;
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		actionsHistory += " + " + value;
	}
	
	public void subtract (int value) {
		
		total -= value;
		actionsHistory += " - " + value;
	}
	
	public void multiply (int value) {
		if(total == 0)
			total = 1;
			
			total *= value;
			actionsHistory += " * " +value;		
	}
	
	public void divide (int value) {
		if(value == 0)
			total = 0;

		else 
			total /= value;
			actionsHistory += " / " + value;
		
	}
	
	public String getHistory () {
			return actionsHistory;

	}
}