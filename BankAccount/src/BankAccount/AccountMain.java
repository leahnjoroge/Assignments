package BankAccount;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AccountMain {
//create and application that contains information of applicants and their financial information, including: name,date of birth,credit score, 
//3-month's average income,last year's reported taxable income and loan amount needed.
		public static void main(String[] args) {
			String name;
			String dateOfBirth;
			Double creditScore;
			Double incomeAvarage;
			Double taxableIncome;
			Double loanAmount;
					Scanner customer = new Scanner(System.in);
					System.out.println("Enter name");
				name = customer.nextLine();
					System.out.println("Enter Date of Birth");
					dateOfBirth = customer.nextLine();
				System.out.println("Enter credit score");
				creditScore = customer.nextDouble();
					System.out.println("Enter 3 month's average income");
				incomeAvarage = customer.nextDouble();
				System.out.println("Enter last year's reported taxable income");
				taxableIncome = customer.nextDouble();
					System.out.println("Enter the amount of loan you are applying for");
					loanAmount  = customer.nextDouble();
				Random random = new Random();
					int a  = random.nextInt(30) + 10;
				String initials = name.substring(0, 2).toUpperCase();
				int s = random.nextInt (600) + 100;
					String userID = a +  initials + s;
				System.out.println("Your loanID is: " + userID);
				System.out.println("Your loan is " + decision(creditScore, loanAmount, taxableIncome, incomeAvarage));
			}
					//if the loan gets approved,then output the mortgage value. if the the loan gets denied then provide an explanation.
					public static String decision(Double creditScore, Double loanAmount, Double taxableIncome, Double incomeAvarage) {
						String Approved = "";
					String Approved1 = "Approved. \nYour mortgage value is " + loanAmount;
					if(creditScore <= 600 ) {
							return Approved1 = "Denied because your credit score is lower than 600.";
						}
				else if (incomeAvarage < 12000){
						return Approved1 = "Denied becuase your income is less than $12,000.";
						}
			else if(loanAmount > taxableIncome * 5) {
					return Approved1 = "Denied becuase the loan amount needed \nis higher than five times your last year's income.";
				}
						return Approved1;
	}
	}


