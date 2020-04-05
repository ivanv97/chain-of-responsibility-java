package main;

public class FiftyDollarsHandler extends ATMHandler {

	public FiftyDollarsHandler(ATMHandler nextHandler, int nominalValue) {
		super(nextHandler, nominalValue);
	}
}
