package BankAccount;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class Customer<Income> {
private static String name;
private int dateOfBirth;
private double CreditScore;
private double income;
private double TaxableIncome;
private double LoanAmount;

public Customer(String name, int dateOfBirth, double creditScore, double income, double taxableIncome,
		double loanAmount) {
	super();
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	CreditScore = creditScore;
	this.income = income;
	TaxableIncome = taxableIncome;
	LoanAmount = loanAmount;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name= name;
}
public int getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(int dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public double getCreditScore() {
	return CreditScore;
}
public void setCreditScore(double creditScore) {
	CreditScore = creditScore;
}
public double getIncome() {
	return income;
}
public void setIncome(double income) {
	this.income = income;
}
public double getTaxableIncome() {
	return TaxableIncome;
}
public void setTaxableIncome(double taxableIncome) {
	TaxableIncome = taxableIncome;
}
public double getLoanAmount() {
	return LoanAmount;
}
public void setLoanAmount(double loanAmount) {
	LoanAmount = loanAmount;
}
ArrayList<Customer> customer = new ArrayList<>();

public ArrayList<Customer> getCustomer() {
	return customer;
}
public void setCustomer(ArrayList<Customer> customer) {
	this.customer = customer;
}
public boolean getCreditScore( double CreditScore) {
	if (  CreditScore <= 600) {
		return false;
	}
	if (CreditScore > 600) {
		return true;
	}
	return true;
}
ArrayList<Income> getIncome = new ArrayList<>();

	
public ArrayList<Income> getGetIncome() {
	return getIncome;
}
public void setGetIncome(ArrayList<Income> getIncome) {
	this.getIncome = getIncome;
}
;
@Override
public String toString() {
	return "Customer [name=" + name + ", dateOfBirth=" + dateOfBirth + ", CreditScore=" + CreditScore + ", income="
			+ income + ", TaxableIncome=" + TaxableIncome + ", LoanAmount=" + LoanAmount + "]";
}

}
