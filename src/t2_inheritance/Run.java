package t2_inheritance;
//부모가 먼저 생성된다.
//호출을 하지 않으면 기본생성자가 나온다 ex)Aa를 부르지않았음으로 Aa기본생성자가 나온다
public class Run {
		public static void main(String[] args) {
			System.out.println("이곳은 Run클래스 입니다");
			
			Bb bb1 = new Bb();
			bb1.areaRec(10, 20);
			bb1.areaPoly(1, 2, 3);
			System.out.println();
			
			Bb bb2 = new Bb(10);
			bb2.areaPoly(2, 3, 4);
			System.out.println();
			
			Bb bb3 = new Bb(10,20,30);
			System.out.println();
			
			System.out.println("2.이곳은 Run클래스 입니다");
		}
}
