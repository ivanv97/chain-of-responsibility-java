package main;

public class TwentyDollarsHandler extends ATMHandler {

	public TwentyDollarsHandler(ATMHandler nextHandler, int nominalValue) {
		super(nextHandler, nominalValue);
	}
}
