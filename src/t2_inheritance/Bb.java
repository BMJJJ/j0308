package t2_inheritance;
//필드는 정의만함 변경은 안됨 가져가와서 쓸수만있음
//부모가 가진 필드도 사용가능하다
public class Bb extends Aa {
	 int su = item1;//Aa에서 item1을 가져옴
	 
	 public Bb() {
		System.out.println("이곳은 Bb클래스의 기본생성자");
	}
	 
	 public Bb(int su) {
		 super(10);//super 무조선 생성자의 바로밑에 와야한다
		 System.out.println("이곳은 Bb클래스의 사용자 정의 생성자, su = " + su);
		}
	 
	 public Bb(int item1, int x, int y) {
		super(item1, x, y); 
	 }
	 
	//사다리꼴 면적
		public void areaPoly(int x, int y, int z) {
			int area = (x + y) * z / 2;
			System.out.println("사다리꼴의 면적(윗변: "+x+" , 아랫변: "+y+" , 높이: "+z+" ) : "   + area);
	 }
}
