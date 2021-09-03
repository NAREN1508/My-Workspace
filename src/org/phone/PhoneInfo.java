package org.phone;

public class PhoneInfo {

	public void phoneName() {

		System.out.println(" The phone name is Lava");
	}

	public void phone() {
		System.out.println("My phone is Mi");
	}

	public static void main(String[] args) {
		PhoneInfo p = new PhoneInfo();

		p.phone();
		p.phoneName();
	}

}
