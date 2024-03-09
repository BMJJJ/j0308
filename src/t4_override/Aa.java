package t4_override;
//부모 메소드를 자식이 재정의해서 사용하는것을 오버라이드 구냥 그대로 가져와서 써도 오버라이드
//오버라이드는 리턴타입이 관계있다
//@=>어노테이션
//final을 붙이면 생성은 되지만 상속이 안된다.
//public final class Aa {
public class Aa {
	private int item1 = 500;
	int item2 = 600;
	
	// 사각형의 면적
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로: "+x+" , 세로: "+y+" ) : " + area);
	}
	
	//원넓이
	//public final void areaCircle(int r) { //final을 사용하면 메소드를 오버라이드(재정의)해서 사용할수 없다.
	public void areaCircle(int r) {
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이는? " + area);
	}
}
