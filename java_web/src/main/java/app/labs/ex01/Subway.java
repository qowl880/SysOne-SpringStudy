package app.labs.ex01;

public class Subway implements Transportation{
	
	private int subwayNumber;
	private int passengerCount;
	private int money;
	
	
	// side effect :부작용, 예측된 값과 다른 값이 대입 
	public Subway(int subwayNumber, int passengerCount, int money) {
		this.subwayNumber = subwayNumber;
		this.passengerCount = passengerCount;
		this.money = money;
	}
	
	@Override
	public void getIn(Passanger pass) {
		this.passengerCount += 1;
		this.money += 1000;
		pass.withdraw(1000);
	}
	

	public void getIn(Student pass) {
		this.passengerCount += 1;
		this.money += 1400;
		pass.withdraw(1400);
	}

	@Override
	public void getOut(Passanger pass){
		this.passengerCount -= 1;
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + subwayNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}
}
