package bank_Transaction;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}

}
