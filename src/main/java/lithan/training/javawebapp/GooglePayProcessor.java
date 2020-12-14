package lithan.training.javawebapp;

public class GooglePayProcessor implements PaymentProcessor {

	@Override
	public boolean process() {
		// process payment
		return true;
	}
	
	public String toString() {
		return "Google Pay Processor: " + process();
	}

}
