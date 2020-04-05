package main;

public class MainClass {

	static ATMHandler getChain() {
		ATMHandler tenDollarsHandler = new TenDollarsHandler(null, ATMHandler.TEN_DOLLARS);
		ATMHandler twentyDollarsHandler = new TwentyDollarsHandler(tenDollarsHandler, ATMHandler.TWENTY_DOLLARS);
		ATMHandler fiftyDollarsHandler = new FiftyDollarsHandler(twentyDollarsHandler, ATMHandler.FIFTY_DOLLARS);
		ATMHandler oneHundredDollarsHandler = new OneHundredDollarsHandler(fiftyDollarsHandler, ATMHandler.ONE_HUNDRED_DOLLARS);
		return oneHundredDollarsHandler;
	}

	public static void main(String[] args) {
		getChain().fetchCash(2430);
	}
}
