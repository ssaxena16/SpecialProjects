package com.sachin.interviewquestion;

class Company
{
	int comp_id;
	String companyName;
	public Company()
	{
		System.out.println("Default Constructor");
	}
	public Company(int comp_id, String companyName)
	{
		System.out.println("Two Argumant Constructor");
		this.comp_id = comp_id;
		this.companyName = companyName;
	}
	public Company(Company cmp)
	{
		System.out.println("Copy Constructor");
		this.comp_id = cmp.comp_id;
		this.companyName = cmp.companyName;
	}
	public void informationAboutComp()
	{
		System.out.println(""+comp_id+"   "+companyName);
	}
}
public class TestCopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = new Company();
		Company company1 = new Company(56,"TSTK");
		company1.informationAboutComp();
		Company company2 = new Company(company1);
		company2.informationAboutComp();

	}

}
