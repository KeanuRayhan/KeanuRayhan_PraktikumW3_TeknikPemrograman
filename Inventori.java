
public class Inventori {

	Barang[] barangs;
	
	//Method untuk menambahkan object Barang
	void initBarang() {
	barangs = new Barang[2];
	barangs[0] = new Barang("001", "Baju", 10);
	barangs[1] = new Barang("002", "Celana", 20);
	}
	
	//Method untuk menampilkan nama barang dan jumlah stock
	void showBarang() {
	System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStock() + ")");
	System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStock() + ")");
	}
	
	void pengadaan() {
		//Pemanggilan method initBarang()
		initBarang();
		//Pemanggilan method addstock(int jumlah)
		barangs[0].addStock(20);
		//barangs[0].stok -= 30; //Bisa juga dikurangi dong?
		//barangs[0].stok *= 30; //dikali juga bisa dong??
		//Pemanggilan method showBarang()
		showBarang();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventori beli = new Inventori();
		beli.pengadaan();

	}

}
