package reservation;

public class Guest {
	private String name;
	private String address;
	private String phone;
	private String email;
	private Card paymentMethod;
	
	public String getName ( ) {
		return name;
	}
	
	public String getAddress ( ) {
		return address;
	}
	
	public String getPhone ( ) {
		return phone;
	}
	
	public String getEmail ( ) {
		return email;
	}
	
	public Card getPaymentMethod ( ) {
		return paymentMethod;
	}
	
	public void setName ( String name ) {
		this.name = name;
	}
	
	public void setAddress ( String address ) {
		this.address = address;
	}
	
	public void setPhone ( String phone ) {
		this.phone = phone;
	}
	
	public void setEmail ( String email ) {
		this.email = email;
	}
	
	public void setPaymentMethod ( Card paymentMethod ) {
		this.paymentMethod = paymentMethod;
	}
}
