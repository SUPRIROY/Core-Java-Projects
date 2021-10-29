public class Address {
	
	private String addressID;
	private String addressLine1,city,state;
	public Address(String addressID, String addressLine1, String city, String state)
	{
		this.addressID = addressID;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
	}
	public String getAddressID() {
		return addressID;
	}
	public void setAddressID(String addressID) {
		this.addressID = addressID;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "addressID=" + addressID + ",\n addressLine1=" + addressLine1 + ",\n city=" + city + ",\n state="
				+ state;
	}
	
}