package t3_override;

public class Cc extends Aa {

//원넓이
//	public void areaCircle(int r) {
//		double area = r * r * Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이는? " + area);
//	}
//	public void areaCircle(int r) {
//		double area = r * r * 3.14;
//		System.out.println("반지름 "+r+"인 원넓이는? " + area);
//	}
	
	public void areaCircle2(int r) {//오버라이딩위반(리턴타입도 같아야한다)선언부가 완전히 같아야 한다.
		double area = r * r * 3.14;
		System.out.println("반지름 "+r+"인 원넓이는? " + area);
	}
}
