
public class Barang {
	
	String kode_barang;
	String nama_barang;
	private int stok;
	
	//Constructor dari Barang
	public Barang(String kode, String nama, int stk) {
	kode_barang = kode;
	nama_barang = nama;
	this.stok = stk;
	}
	
	//Method getter untuk mengakses object stok
	public int getStock() {
		return this.stok;
	}
	
	//Method untuk melakukan menambah stok sesuai jumlah dengan aritmatika pertambahan saja
	public void addStock(int jumlah) {
		this.stok += jumlah;
	}

}
