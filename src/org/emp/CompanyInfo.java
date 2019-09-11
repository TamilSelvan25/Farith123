package org.emp;

public class CompanyInfo {
	public void companyname() {
		System.out.println("Company Nmae:CSK");
		
	}
	public void companyid() {
		System.out.println("CompanyId:1111");

	}
	public void companyaddress() {
		System.out.println("Compan Address:Chennai");

	}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyname();
		c.companyid();
		c.companyaddress();
	}

}
