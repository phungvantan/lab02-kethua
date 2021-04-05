package vantan.dev;

public class MainApp {

	public static void main(String[] args) {
	
		Cat cat = new Cat("Meo Tom" , 10, "Xanh" , "Vang");
		System.out.println("can nang " + cat.tenGoi);
		System.out.println("mau long " + cat.mauLong);
		System.out.println("mau long " + cat.mauLong);
		System.out.println("mau mat " + cat.mauMat);
		cat.an();
		
		System.out.println("==========================");
		Fish fish = new Fish("Ca map" , 100, "Xam", "Xanh");
		System.out.println("can nang " + fish.tenGoi);
		System.out.println("mau long " + fish.canNang);
		System.out.println("kieu vay " + fish.kieuVay);
		System.out.println("loai nuoc " + fish.loaiNuoc);
		fish.an();
	}

}