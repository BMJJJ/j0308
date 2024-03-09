package t7_polymorphism;

public class Bb extends Aa {
	public int su = 20;
	
	public Bb() {
		System.out.println("이곳은 Bb 기본 생성자 입니다.");
	}
	
	public void modAa() {
		System.out.println("이곳은 Bb클래스의 modBb메소드 입니다." );
	}
}
