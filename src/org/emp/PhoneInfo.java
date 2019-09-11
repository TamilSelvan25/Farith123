package org.emp;

public class PhoneInfo {
	public void phoneName() {
		System.out.println("Name:Redmi");

	}
	public void phoneMieiNum() {
		System.out.println("Imei:787464008327");

	}
	public void camera() {
		System.out.println("Camera:12MP");

	}
	public void storage() {
		System.out.println("Storage:6GB");

	}
	public void osName() {
		System.out.println("Os:Android");

	}
	public static void main(String[] args) {
		PhoneInfo p=new PhoneInfo();
		p.phoneName();
		p.phoneMieiNum();
		p.camera();
		p.storage();
		p.osName();
	}





}
