package Lab;

import java.util.Scanner;

public class Car{
    public static void main(String [] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter annual interest rate, for example, 8.25: ");
            double annualInterestRate = input.nextDouble();
            System.out.print("Enter number of years as an integer: ");
            int numberOfYears = input.nextInt();
            System.out.print("Enter loan amount, for example, 120000.95: ");
            double loanAmount = input.nextDouble();
            Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
            System.out.print("The Loan was created on " + loan.loanDate());
            System.out.println("The monthly payment is " + String.format("%.2f",loan.getMonthlyPayment()));
            System.out.println("The monthly payment is " + String.format("%.2f",loan.getTotalPayment()));
            input.close();

    }

}
