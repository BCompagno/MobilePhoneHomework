package mobilePhoneHomework;

public class Main {

	public static void main(String[] args) {
		 
		MobilePhone phone = new MobilePhone("Apple", "iPhone", 5555555, 500 );
		
		phone.makeCall(5550005);
		phone.installApp("Candy Crush App");
		phone.displayInfo();

	}

}
