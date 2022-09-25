package Pemesanan;

public class Produk {
	private String nama_produk;
	private double harga_produk;
	private int stok;
	
	public Produk() {
		nama_produk = "";
		harga_produk = 0;
		stok = 0;
	}
	
	public String getNama_produk ( ) {
		return nama_produk;
	}
		
	public void setNama_produk (String nama_makanan) {
		this.nama_produk = nama_makanan;
	}
	
	public double getHarga_produk () {
		return harga_produk;
	}
	
	public void setHarga_produk (double harga_makanan) {
		this.harga_produk = harga_makanan;
	}
	
	public int getStok() {
		return stok;
	}
	
	public void setStok (int stok) {
		this.stok = stok;
	}
}
