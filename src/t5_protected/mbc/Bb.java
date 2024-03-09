package t5_protected.mbc;
//다른 패키지이기때문에 임포트가 필요
import t5_protected.kbs.Aa;

public class Bb extends Aa {
	public int a2 = 10;
	protected int b2 =20;
	int c2 = 30;
	private int d2 = 40;
	
	public void modA2() {
		System.out.println("이곳은 Bb클래스의 modA메소드 입니다.");
	}
	protected void modB2() {
		System.out.println("이곳은 Bb클래스의 modB메소드 입니다.");
	}
	void modC2() {
		System.out.println("이곳은 Bb클래스의 modC메소드 입니다.");
	}
	private void modD2() {
		System.out.println("이곳은 Bb클래스의 modD메소드 입니다.");
	}
	
	@Override
	public void test() {
		modC2();
		
		a = 100;
		b = 200;
		//c = 300;디폴트라 안된다
		//d = 400;private라 안됨
		int d = getD();
		System.out.println("d " + d);
	}
}
