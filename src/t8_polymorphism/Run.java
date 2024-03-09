package t8_polymorphism;

public class Run {
	public static void main(String[] args) {
		Bb bb = new Bb();
		System.out.println();
		
		System.out.println("bb.su : " + bb.su);
		bb.modBb();
		bb.modAa();
		System.out.println();
		
		/*---------Up Casting--------*/
		
		Aa ba = new Bb();
		ba.modAa();
		System.out.println("===");
		
/*---------Up Casting--------*/
		//부모로 Up Casting이 되어 있을경우에만 자신으로 Down Casting할수 있다.
		Bb bab = (Bb)ba;
		bab.modAa();
		System.out.println();
		
		/*----------------------------------*/
		Aa ca = new Cc();
		ca.modAa();
		ca.modCc();
		ca.modHH(50, 100);
		
				
	}
}
