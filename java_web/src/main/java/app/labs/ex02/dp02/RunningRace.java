package app.labs.ex02.dp02;

// Template Design 패턴 
public abstract class RunningRace {
	// 해당 값은 여기서 구현 
	private void ready() {
		System.out.println("준비단계");
	}
	
	// 상속 받는 클래스에서 구현 
	protected abstract void run();
	
	// 해당 값은 여기서 구현 
	private void finish() {
		System.out.println("결승선 도착");
	}
	
	// final을 통해 값 변경 불가 
	// Template Design 패턴 
	// 메서드 실행 순서를 지정 
	public final void race() {
		ready();
		run();
		finish();
	}
}
