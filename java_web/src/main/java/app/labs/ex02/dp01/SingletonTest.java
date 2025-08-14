package app.labs.ex02.dp01;



public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstatnce();
		singleton.showCount();
		
		Singleton singleton1 = Singleton.getInstatnce();
		singleton1.showCount();
		
		Singleton singleton2 = Singleton.getInstatnce();
		singleton2.showCount();
	}
	
	
	
	
}
