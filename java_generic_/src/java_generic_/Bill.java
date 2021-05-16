package java_generic_;

public class Bill {
	
	private String billId;
	private String paymentMode;
	private static int counter;
	
	static {
		counter=9001;
	}
	
	public Bill(String paymentMode) {
		this.paymentMode=paymentMode;
		setBillId("B"+getCounter());
	}
	
	public String getBillId() {
		return this.billId;
	}
	
	public void setBillId(String billId) {
		this.billId=billId;
	}
	
	public String getPaymentMode() {
		return this.paymentMode;
	}
	
	public void setPaymentMode(String paymentMode) {
		this.paymentMode=paymentMode;
	}
	
	public static int getCounter() {
		return Bill.counter++;
	}

}
