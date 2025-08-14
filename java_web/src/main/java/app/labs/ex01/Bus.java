package app.labs.ex01;

public class Bus implements Transportation{
	
	private int busNumber;
	private int passengerCount;
	private int money;
	
	
	public Bus(int busNUmber) {
		this.busNumber = busNumber;
		this.passengerCount = 0;
		this.money = 0;
	}
	
	@Override
	public void getIn(Passanger pass) {
		this.passengerCount += 1;
		this.money += 1000;
		pass.withdraw(1000);
	}

	public void getIn(Student pass) {
		this.passengerCount += 1;
		this.money += 900;
		pass.withdraw(900);
	}
	
	@Override
	public void getOut(Passanger pass){
		this.passengerCount -= 1;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}
}
