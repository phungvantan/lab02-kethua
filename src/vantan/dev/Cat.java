package vantan.dev;

public class Cat extends Animal {
	String mauMat;
	String mauLong;

	public Cat(String tenGoi, int canNang, String mauMat, String mauLong) {
		super(tenGoi, canNang);
		this.mauMat = mauMat;
		this.mauLong = mauLong;

	}

	public void an() {
		System.out.println("Animal an");
		// TODO Auto-generated method stub
		
	}

}