
public class AgreegationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batery batery = new Batery();
		MobileSamsung ms = new MobileSamsung(10545, batery);
		ms.getMobileBatery();

	}

}

class MobileSamsung {
	private int mi_id;
	private Batery batery; // Aggregation Example ....

	MobileSamsung(int mi_id, Batery batery) {
		this.mi_id = mi_id;
		this.batery = batery;

	}

	public void getMobileBatery() {
		batery.getSamsungBatery();
	}

}

class Batery {
	public void getSamsungBatery() {
		System.out.println("Samsung Mobile Batery");
	}

	public void getNokiaBatery() {
		System.out.println("Nokia Mobile Batery");
	}

}