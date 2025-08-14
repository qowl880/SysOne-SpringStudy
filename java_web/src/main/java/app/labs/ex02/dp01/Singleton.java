package app.labs.ex02.dp01;


// 싱글톤 dp - 공용 객체 1개 생성
public class Singleton {
	
	private static Singleton singleton = null;
	private int count = 0;
	
	private Singleton() {}
	
	public static Singleton getInstatnce() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	public void showCount() {
		count++;
		System.out.println("count" + count);
	}

}
