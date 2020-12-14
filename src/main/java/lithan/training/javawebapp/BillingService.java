package lithan.training.javawebapp;

public class BillingService {
	private PaymentProcessor paymentProcessor;
	// Instantiate BillingService class
	public BillingService(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}

	 public boolean completePayment() {
		 return paymentProcessor.process();
	 }
	 
	 private String getPaymentProcessorType() {
		 if (paymentProcessor instanceof CreditCardProcessor) return "Credit Card: ";
		 else return "Google Pay: ";
	 }
	 
	 public String toString() {
		 return getPaymentProcessorType() +  completePayment();
	 }
}
