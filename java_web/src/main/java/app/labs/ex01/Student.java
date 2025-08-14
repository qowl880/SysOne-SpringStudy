package app.labs.ex01;

public class Student implements Passanger{
	
	private int regNumber;
	private String name;
	private int money;

	
	public Student(int regNumber, String name) {
		this.regNumber = regNumber;
		this.name = name;
		this.money = 0;
	}

	
	@Override
	public void withdraw(int amount) {
		this.money -= amount;
		
	}

	@Override
	public void deposit(int amount) {
		this.money += amount;
	}


	@Override
	public String toString() {
		return "Student [regNumber=" + regNumber + ", name=" + name + ", money=" + money + "]";
	}

	
}
