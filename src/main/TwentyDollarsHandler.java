package main;

public class TwentyDollarsHandler extends ATMHandler {

	public TwentyDollarsHandler(ATMHandler nextHandler) {
		super(nextHandler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fetchCash(int amountToFetch) {
		int remainingAmount = 0;
		if (amountToFetch >= ATMHandler.TWENTY_DOLLARS) {
			int numberOfNotesFetched = amountToFetch / ATMHandler.TWENTY_DOLLARS;
			remainingAmount = amountToFetch % ATMHandler.TWENTY_DOLLARS;
			System.out.println("The ATM fetched " + numberOfNotesFetched + " notes of 20 dollars");
			System.out.println("Remaining amount: " + remainingAmount);
			this.nextHandler.fetchCash(remainingAmount);
		} else {
			this.nextHandler.fetchCash(amountToFetch);
		}
	}
}
