package lithan.training.javawebapp;

public class CreditCardProcessor implements PaymentProcessor{

	@Override
	public boolean process() {
		// process payment
		return true;
	}
	
	public String toString() {
		return "Credit Card Processor: " + process();
	}

}
