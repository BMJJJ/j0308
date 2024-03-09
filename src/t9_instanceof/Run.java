package t9_instanceof;
//instanceof로 업캐스팅이 되었는지 먼저 확인
public class Run {
	public static void main(String[] args) {
		
		//Aa aa = new Aa();
		Aa aa = new Bb();
		
		//aa객체가 과거에 Aa타입으로 업캐스팅했었는지를 알아보고 처리해야함
		if(aa instanceof Bb) {
			Bb bb = (Bb)aa; 
			System.out.println("Down Casting성공");
		}
		else {
			System.out.println("Down Casting불가");
		}
	}
}
