package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Empid is:123");

	}
	public void empName() {
		System.out.println("Name:Tamil");
	}
	public void empDob() {
		System.out.println("Dob:25-07-1996");
	}
	public void empEmail() {
		System.out.println("EMAIL:tamiltnjys@3gmail.com");
	}
	public void empPhone() {
		System.out.println("Phone:1234679");
	}
	public void empAddress() {
		System.out.println("Address:Chennai");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}




}
