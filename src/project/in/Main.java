package project.in;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Atmopeimple ob = new Atmopeimple();
		int atmno = 12345;
		int atmpin = 123;
		System.out.println("Welcome to ATM Machine !!!");
		System.out.print("Enter Atm Number:");
		Scanner sc = new Scanner(System.in);
		int atmNum = sc.nextInt();

		System.out.print("Enter pin:");
		int pin = sc.nextInt();

		if (atmno == atmNum && atmpin == pin) {
			while (true) {
				System.out.println(" 1.Check Available Balance \n 2.Withdraw Amount \n 3.Deposit Amount \n 4.Exit\n");
				System.out.println("Enter Choice :");
				int ch = sc.nextInt();
				if (ch == 1) {

					ob.viewBalance();
					System.out.println("----------------------------------------------");
					
				} else if (ch == 2) {
					System.out.println("Enter Amount to Withdraw :");
					double withdrawAmount = sc.nextDouble();
					ob.withdrawAmount(withdrawAmount);
					System.out.println("----------------------------------------------");

				} else if (ch == 3) {
					System.out.print("Enter Amount to Deposit :");
					double depositeAmount = sc.nextDouble(); // 5000
					ob.depositAmount(depositeAmount);
					System.out.println("----------------------------------------------");
				}

				else if(ch ==4) {
                     ob.exit();
				}
				else {
					System.out.println("Enter valid Choice !!");
				}
			}
		} 
		else {
			System.out.println("Incorrect Atm Number or pin");
			System.exit(0);
		}

	}

}
