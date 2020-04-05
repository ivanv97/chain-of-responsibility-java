package main;

public class TenDollarsHandler extends ATMHandler {

	public TenDollarsHandler(ATMHandler nextHandler, int nominalValue) {
		super(nextHandler, nominalValue);
	}
}
