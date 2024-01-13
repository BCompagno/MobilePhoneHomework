package mobilePhoneHomework;

public class MobilePhone {

	String brand;
	String model;
	int phoneNumber;
	int storageCapacity;
	
	public MobilePhone() {
		brand=null;
		model=null;
		phoneNumber=0;
		storageCapacity=0;
	}
	
	public MobilePhone(String brand, String model, int num, int capacity ) {
		this.brand=brand;
		this.model=model;
		this.phoneNumber=num;
		this.storageCapacity=capacity;
		
	}
	
	public void makeCall( int num) {
		System.out.printf( "Calling %s from our %s %s phone.\n", num, brand, model );
	}
	
	public void installApp( String app) {
		System.out.printf("Installing %s on our %s %s phone.\n", app, brand, model);
	}
	
	public void displayInfo() {
		System.out.printf("Brand: %s\n"
				+ "Model: %s\n"
				+ "Phone Number: %s\n"
				+ "Storage Capacity: %sGB", 
				brand, model, phoneNumber, storageCapacity);
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	

}
