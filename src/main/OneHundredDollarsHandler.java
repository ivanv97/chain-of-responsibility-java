package main;

public class OneHundredDollarsHandler extends ATMHandler {

	public OneHundredDollarsHandler(ATMHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void fetchCash(int amountToFetch) {
		int remainingAmount = 0;
		if (amountToFetch >= ATMHandler.ONE_HUNDRED_DOLLARS) {
			int numberOfNotesFetched = amountToFetch / ATMHandler.ONE_HUNDRED_DOLLARS;
			remainingAmount = amountToFetch % ATMHandler.ONE_HUNDRED_DOLLARS;
			System.out.println("The ATM fetched " + numberOfNotesFetched + " notes of 100 dollars");
			System.out.println("Remaining amount: " + remainingAmount);
			this.nextHandler.fetchCash(remainingAmount);
		} else {
			this.nextHandler.fetchCash(amountToFetch);
		}
	}
}
