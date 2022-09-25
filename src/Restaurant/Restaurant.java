package Restaurant;

public class Restaurant {
	private Makanan [] makanan;
	public static byte id = 0;
	
	public Restaurant() {
		makanan = new Makanan[10];
		for (int i = 0; i < 10; i++) {
			makanan[i] = new Makanan();
		}
		id = 0;
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.makanan[id].setNama_makanan(nama);
		this.makanan[id].setHarga_makanan(harga);
		this.makanan[id].setStok(stok);
	}
	
	public void tampilMenuMakanan() {
		for (int i = 0; i <= id; i++) {
			if (!isOutOfStock(i)) {
				System.out.println(makanan[i].getNama_makanan() + "[" + makanan[i].getStok() + "]" + "\tRp." + makanan[i].getHarga_makanan());
			}	
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(makanan[id].getStok() == 0) {
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
		
		for (int i = 0; i < makanan.length; i++) {
			if (makanan[i].getNama_makanan().equals(nama)) {
				if (makanan[i].getStok() >= jumlah) {
					newStock = makanan[i].getStok();
					newStock = newStock - jumlah;
					makanan[i].setStok(newStock);
					
					harga = makanan[i].getHarga_makanan() * jumlah;
					System.out.println (makanan[i].getNama_makanan() + " Rp." + harga);
				} else {
					System.out.println("Input Salah");
				}
			}
		}
	}
}