package com.controller;

import java.sql.SQLException;
import java.util.*;

import com.dto.AccountAndCustomer;
import com.exception.InsufficientFundException;
import com.exception.InvalidAccountException;
import com.exception.OverDraftLimitExcededException;
import com.model.Account;
import com.model.Address;
import com.model.Customer;
import com.service.IBankService;
import com.service.ICustomerService;
import com.utility.RandomId;

public class BankController {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ICustomerService iCustomerService = new ICustomerService();
		IBankService iBankService = new IBankService();
		
		
		while(true) {
			System.out.println("           Bank");
			System.out.println("-------------------------");
		
			System.out.println("1. Create Account");
			System.out.println("2. Get account Balance");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Transfer");
			System.out.println("6. Get Account Details");
			System.out.println("7. Calculate Interest Rate");
			System.out.println("0. Exit");
		
			int choice = sc.nextInt();
			if(choice == 0)
				break; 
			
			switch(choice) {
			case 1:
				try {
				System.out.println("Enter Customer Details:");
				
				System.out.println("First Name:");
				String fName = sc.next();
				System.out.println("Last Name:");
				String lName = sc.next();
				System.out.println("Date of Birth:");
				String dob = sc.next();
				
				int customerId = RandomId.getRandomId();
				Customer customer = new Customer(customerId, fName, lName, dob);
				int s1 = iBankService.createCustomer(customer);
				
				System.out.println("Enter Address Details:");
				System.out.println("State:");
				String state = sc.next();
				System.out.println("City:");
				String city = sc.next();
				System.out.println("Pincode:");
				int pincode = sc.nextInt();
				
				int addressId = RandomId.getRandomId();
				Address address = new Address(addressId, state, city, pincode, customerId);
				int s2 = iBankService.createAddress(address);
				
				System.out.println("Enter Account Details:");
				System.out.println("Account Type:");
				String type = sc.next();
				System.out.println("Account Balance:");
				double amount = sc.nextDouble();
				
				int accountId = RandomId.getRandomId();
				Account account = new Account(accountId, type, amount, customerId);
				int s3 = iBankService.createAccount(account);
				
				if(s1 == 1 & s2 == 1 & s3 == 1) {
					System.out.println("Account created Sucessfully");
					System.out.println("Please note, your account number:"+accountId);
				}
				}catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
				
			case 2:
				System.out.println("Enter account Number:");
				long accountNumber = sc.nextLong();
				float amount = 0;
				try {
					amount = iCustomerService.getAccountBalance(accountNumber);
				} catch (SQLException | InvalidAccountException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Account Balance: ");
				System.out.println(amount);
				System.out.println();
				break;
				
			case 3:
				System.out.println("Enter account Number:");
				accountNumber = sc.nextLong();
				System.out.println("Enter Amount to deposit:");
				amount = sc.nextFloat();
				
				int status = 0;
				try {
					status = iCustomerService.deposit(accountNumber, amount);
				} catch (SQLException | InvalidAccountException e) {
					System.out.println(e.getMessage());
				}
				
				if(status == 1)
					System.out.println("Amount Deposited Sucessfully");
				else
					System.out.println("Deposit failed!!");

				break;
				
			case 4:
				
				System.out.println("Enter account Number:");
				accountNumber = sc.nextLong();
				System.out.println("Enter Amount to withdraw:");
				amount = sc.nextFloat();
				
				status = 0;
				
				try {
					status = iCustomerService.withdraw(accountNumber, amount);
					if(status == 1)
						System.out.println("Amount Withdrawed Sucessfully");
					else
						System.out.println("Withdraw failed!!");
					
				} catch (InsufficientFundException | OverDraftLimitExcededException | SQLException | InvalidAccountException e) {
					System.out.println(e.getMessage());
				}

				break;
				
			case 5:
				System.out.println("Enter Account Number to withdraw from:");
				long fromAccountNumber = sc.nextLong();
				System.out.println("Enter Account Number to deposit into:");
				long toAccountNumber = sc.nextLong();
				System.out.println("Enter Amount to transfer:");
				amount = sc.nextFloat();
				
				status = 0;
				
				try {
					status = iCustomerService.transfer(fromAccountNumber, toAccountNumber, amount);
				} catch (InsufficientFundException | OverDraftLimitExcededException | SQLException | InvalidAccountException e) {
					System.out.println(e.getMessage());
				}
				
				
				if(status == 1)
					System.out.println("Amount Transfered Sucessfully");
				else
					System.out.println("Transfer failed!!");

				break;
				
			case 6:
				System.out.println("Enter account Number:");
				accountNumber = sc.nextLong();
		
				try {
					
					AccountAndCustomer details = iCustomerService.getAccountDetails(accountNumber);
					
					System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n","Acc.ID","Acc.Type","Acc.Balance",
							"Cust.Id", "Cust.FirstName", "Cust.LastName", "Cust.DOB");
					System.out.println("-----------------------------------------------------------------------------------------------------------------");
					System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n",details.getAccount_id(), details.getAccount_type(),
							details.getAccount_balance(), details.getCustomer_id(), details.getCustomer_first_name(), 
							details.getCustomer_last_name(), details.getCustomer_dob());
					
				} catch (SQLException | InvalidAccountException e) {
					System.out.println(e.getMessage());
				}
				
				System.out.println();
				break;
				
			case 7:
				System.out.println("Enter account Number:");
				accountNumber = sc.nextLong();
				
				try {
					double interest = iBankService.calculateInterest(accountNumber);
					System.out.println("Calculated Interest: "+interest);
					System.out.println("Do you want to add this amount to your Account Balance?(y/n)");
					String c = sc.next();
					
					if(c.equalsIgnoreCase("n"))
						break;
					
					if(iCustomerService.isValidForInterest(accountNumber)) {
						status = iCustomerService.deposit(accountNumber, interest);
						if(status == 1)
						System.out.println("Interest Added Sucessfully!!");
						else
							System.out.println("Failed to Add!!");
					}		
					
				} catch (SQLException | InvalidAccountException e) {
					System.out.println(e.getMessage());
				}
				
				System.out.println();
				break;
			}
			
		}
		
		sc.close();
	}

}
