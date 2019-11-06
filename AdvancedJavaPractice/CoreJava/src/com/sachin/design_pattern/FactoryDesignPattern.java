package com.sachin.design_pattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoanFactory loanFactory = new LoanFactory();
		System.out.println("Loan is " + loanFactory.getPlan("homeLoan").getIntersetRate());

	}

}

interface LoanPlan {
	public double getIntersetRate();
}

class HomeLoan implements LoanPlan {
	public double getIntersetRate() {
		return 0.85;
	}
}

class CarLoan implements LoanPlan {
	public double getIntersetRate() {
		return 0.95;
	}
}

class LoanFactory {
	public LoanPlan getPlan(String loanType) {
		if ("homeLoan".equalsIgnoreCase(loanType)) {
			return new HomeLoan();
		} else if ("carLoan".equalsIgnoreCase(loanType)) {
			return new CarLoan();
		} else {
			return null;
		}

	}

}