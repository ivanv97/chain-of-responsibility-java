package main;

public abstract class ATMHandler {
	public static final int TEN_DOLLARS = 10;
	public static final int TWENTY_DOLLARS = 20;
	public static final int FIFTY_DOLLARS = 50;
	public static final int ONE_HUNDRED_DOLLARS = 100;
	
	ATMHandler nextHandler;

	public ATMHandler(ATMHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void fetchCash(int amountToFetch);
}
