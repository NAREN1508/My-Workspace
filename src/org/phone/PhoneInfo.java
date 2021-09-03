package org.phone;

public class PhoneInfo {
	
	public void phoneName() {
		
		System.out.println(" The phone name is Lava");
	}
	
	public void phoneMieiNumber() {
		
		System.out.println(" the Imei number is 158231464656564846565");
	}
	
	public void camera() {
		
		System.out.println(" my camera is 5MP");
	}
	
	public void storage() {
		
		System.out.println("the storage capacity is 8gb");
		}
	
	public void osName() {
		
		System.out.println("Os is android");

	}
	
	public static void main(String[] args) {
		PhoneInfo p = new PhoneInfo();
		
		p.osName();
		p.phoneMieiNumber();
		p.camera();
		p.storage();
		p.osName();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
