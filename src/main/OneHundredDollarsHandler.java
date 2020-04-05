package main;

public class OneHundredDollarsHandler extends ATMHandler {

	public OneHundredDollarsHandler(ATMHandler nextHandler, int nominalValue) {
		super(nextHandler, nominalValue);
	}
}
