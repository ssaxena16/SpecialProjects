package com.sachin.design_pattern;

import java.awt.print.Book;

public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory abstractFactory = new Bankfactory();
		System.out.print(" " + abstractFactory.getBank("SBI").getBankName());
		abstractFactory = new LoanFactory1();
		System.out.println("  " + abstractFactory.getLoan("educationLoan").getInterestRate());

	}

}

interface Bank {
	public String getBankName();
}

class SBI implements Bank {
	public String getBankName() {
		return "SBI";
	}
}

class PNB implements Bank {
	public String getBankName() {
		return "PNB";
	}
}

class BOB implements Bank {
	public String getBankName() {
		return "BOB";
	}
}

interface Loan {
	public double getInterestRate();
}

class BussinessLoan implements Loan {
	public double getInterestRate() {
		return 10.12;
	}
}

class EducationLoan implements Loan {
	public double getInterestRate() {
		return 4.12;
	}
}

interface AbstractFactory {
	public Bank getBank(String bankName);

	public Loan getLoan(String loanType);
}

class Bankfactory implements AbstractFactory {
	public Bank getBank(String bankName) {
		if ("SBI".equalsIgnoreCase(bankName))
			return new SBI();
		else if ("PNB".equalsIgnoreCase(bankName))
			return new PNB();
		else if ("BOB".equalsIgnoreCase(bankName))
			return new BOB();
		else
			return null;
	}

	public Loan getLoan(String loanType) {
		return null;
	}
}

class LoanFactory1 implements AbstractFactory {
	public Loan getLoan(String loanType) {
		if ("bussinessLoan".equalsIgnoreCase(loanType))
			return new BussinessLoan();
		else if ("educationLoan".equalsIgnoreCase(loanType))
			return new EducationLoan();
		else
			return null;
	}

	public Bank getBank(String bankName) {
		return null;
	}
}
