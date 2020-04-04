package main;

public class MainClass {

	static ATMHandler getChain() {
		ATMHandler tenDollarsHandler = new TenDollarsHandler(null);
		ATMHandler twentyDollarsHandler = new TwentyDollarsHandler(tenDollarsHandler);
		ATMHandler fiftyDollarsHandler = new FiftyDollarsHandler(twentyDollarsHandler);
		ATMHandler oneHundredDollarsHandler = new OneHundredDollarsHandler(fiftyDollarsHandler);
		return oneHundredDollarsHandler;
	}

	public static void main(String[] args) {
		getChain().fetchCash(2430);
	}

}
