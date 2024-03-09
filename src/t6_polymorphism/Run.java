package t6_polymorphism;
//업캐스팅이라 함(upcasting)
public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		System.out.println();
		
		Bb bb = new Bb();
		Aa ba = bb;//b가a로간다 #1
		Aa ba2 = new Bb();//#2
		System.out.println();
		
		Cc cc = new Cc();
		Aa ca = cc;
		Aa ca2 = new Cc();
		System.out.println();
		
		Dd dd = new Dd();
		Bb db = new Dd();
		Aa da = new Dd();
		System.out.println();
		
		Ee ee = new Ee();
		Cc ec = new Ee();
		Aa ea = new Ee();
	}
}
