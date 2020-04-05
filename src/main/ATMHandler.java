package main;

public abstract class ATMHandler {
	public static final int TEN_DOLLARS = 10;
	public static final int TWENTY_DOLLARS = 20;
	public static final int FIFTY_DOLLARS = 50;
	public static final int ONE_HUNDRED_DOLLARS = 100;

	protected int nominalValue;
	protected ATMHandler nextHandler;

	public ATMHandler(ATMHandler nextHandler, int nominalValue) {
		this.nextHandler = nextHandler;
		this.nominalValue = nominalValue;
	}

	/**
	 * Fetches the respective number of bank notes of
	 * each nominal value - 10, 20, 50, 100.
	 * If the amount to fetch is larger than the nominal value
	 * of the current handler it fetches number of bank notes
	 * until the remaining amount is smaller and passed to the next handler.
	 * If the amount to fetch is smaller than the nominal value of the current
	 * handler, the next handler may be able to fetch some bank notes
	 * so the amount to fetch is passed on to it.
	 * @param amountToFetch
	 */
	public void fetchCash(int amountToFetch) {
		int remainingAmount = 0;
		if (amountToFetch >= this.nominalValue) {
			int numberOfNotesFetched = amountToFetch / this.nominalValue;
			remainingAmount = amountToFetch % this.nominalValue;
			System.out
					.println("The ATM fetched " + numberOfNotesFetched + " notes of " + this.nominalValue + " dollars");
			System.out.println("Remaining amount: " + remainingAmount);
			if (nextHandler != null)
				this.nextHandler.fetchCash(remainingAmount);
		} else if (nextHandler != null) {
			this.nextHandler.fetchCash(amountToFetch);
		}
	};
}
