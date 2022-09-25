package Pemesanan;

public class Penjualan {
	private Produk [] produk;
	public static byte id = 0;
	
	public Penjualan() {
		produk = new Produk[10];
			for (int i = 0; i < 10; i++) {
				produk[i] = new Produk();
			}
		id = 0;
	}
	
	public void tambahMenuProduk(String nama, double harga, int stok) {
		this.produk[id].setNama_produk(nama);
		this.produk[id].setHarga_produk(harga);
		this.produk[id].setStok(stok);
	}
	
	public void tampilMenuProduk() {
		for (int i = 0; i <= id; i++) {
			if (!isOutOfStock(i)) {
				System.out.println(produk[i].getNama_produk() + "[" + produk[i].getStok() + "]" + "\tRp." + produk[i].getHarga_produk());
			}	
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(produk[id].getStok() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
	}
	
	public void transaksi (String nama, int jumlah) {
		int newStock;
		double harga;
		
		for (int i = 0; i < produk.length; i++) {
			if (produk[i].getNama_produk().equals(nama)) {
				if (produk[i].getStok() >= jumlah) {
					newStock = produk[i].getStok();
					newStock = newStock - jumlah;
					produk[i].setStok(newStock);
					
					harga = produk[i].getHarga_produk() * jumlah;
					System.out.println (produk[i].getNama_produk() + " Rp." + harga);
				} else {
					System.out.println("Input Salah");
				}
			}
		}
	}
}
