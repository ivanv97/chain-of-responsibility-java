package main;

public class TenDollarsHandler extends ATMHandler {

	public TenDollarsHandler(ATMHandler nextHandler) {
		super(nextHandler);
	}

	@Override
	public void fetchCash(int amountToFetch) {
		if (amountToFetch >= ATMHandler.TEN_DOLLARS) {
			int numberOfNotesFetched = amountToFetch / ATMHandler.TEN_DOLLARS;
			int remainingAmount = amountToFetch % ATMHandler.TEN_DOLLARS;
			System.out.println("The ATM fetched " + numberOfNotesFetched + " notes of 10 dollars");
			System.out.println("Amount that couldn't be fetched: " + remainingAmount);
		}
	}
}
