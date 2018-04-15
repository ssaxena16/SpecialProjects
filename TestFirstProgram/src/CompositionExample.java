
public class CompositionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileSamsung1 ms = new MobileSamsung1(1024);
		ms.getMobileBatery();

	}

}

class MobileSamsung1 {
	private int mi_id;
	private final Batery1 batery; // Composition Example ....

	MobileSamsung1(int mi_id) {
		this.mi_id = mi_id;
		batery = new Batery1();

	}

	public void getMobileBatery() {
		batery.getSamsungBatery();
	}

}

class Batery1 {
	public void getSamsungBatery() {
		System.out.println("Samsung Mobile Batery");
	}

	public void getNokiaBatery() {
		System.out.println("Nokia Mobile Batery");
	}

}