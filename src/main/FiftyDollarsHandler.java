package main;

public class FiftyDollarsHandler extends ATMHandler {

	public FiftyDollarsHandler(ATMHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void fetchCash(int amountToFetch) {
		int remainingAmount = 0;
		if (amountToFetch >= ATMHandler.FIFTY_DOLLARS) {
			int numberOfNotesFetched = amountToFetch / ATMHandler.FIFTY_DOLLARS;
			remainingAmount = amountToFetch % ATMHandler.FIFTY_DOLLARS;
			System.out.println("The ATM fetched " + numberOfNotesFetched + " notes of 50 dollars");
			System.out.println("Remaining amount: " + remainingAmount);
			this.nextHandler.fetchCash(remainingAmount);
		} else {
			this.nextHandler.fetchCash(amountToFetch);
		}

	}
}
