package project.in;

public class Atmopeimple implements AtmOpeinterface {
    ATM3 atm = new ATM3();
	
	@Override
	public void viewBalance() {
		System.out.println("Available Balance is :"+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdraw) {
		// TODO Auto-generated method stub
		if(withdraw<=atm.getBalance()) {
		System.out.println(withdraw +"Amount Withdrawed successfully !!!");
		atm.setBalance(atm.getBalance()- withdraw);
		viewBalance();
		}
		else {
			System.out.println("Insufficient Balance !!!");
		}
		
	}
	@Override
	public void depositAmount(double deposit) {
		// TODO Auto-generated method stub
		System.out.println(deposit + " Deposited Successfully !!!");
		atm.setBalance(atm.getBalance()+deposit);
		viewBalance();
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}
