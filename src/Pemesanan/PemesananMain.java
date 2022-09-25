package Pemesanan;
import java.util.Scanner;

public class PemesananMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String nama_produkBeli;
		int jumlah;
		String konfirmasi;
		boolean selesai = true;
		
		Penjualan menu = new Penjualan();
		menu.tambahMenuProduk("Bala-bala", 1_000, 10);
		Penjualan.nextId();
		menu.tambahMenuProduk("Gehu", 1_000, 20);
		Penjualan.nextId();
		menu.tambahMenuProduk("Tahu", 1_000, 15);
		Penjualan.nextId();
		menu.tambahMenuProduk("Molen", 1_000, 25);
		Penjualan.nextId();
		menu.tambahMenuProduk("Cireng", 1_000, 20);
		Penjualan.nextId();
		menu.tambahMenuProduk("Pisang", 1_000, 10);
		Penjualan.nextId();
		menu.tambahMenuProduk("Singkong", 1_000, 20);
		Penjualan.nextId();
		menu.tambahMenuProduk("Risol", 1_000, 25);
		Penjualan.nextId();
		menu.tambahMenuProduk("Lumpia", 1_000, 5);
		Penjualan.nextId();
		menu.tambahMenuProduk("Tempe", 1_000, 15);
		
		while (selesai) {
			System.out.println("MENU");
			menu.tampilMenuProduk();
			
			System.out.println(" ");
			System.out.print("Makanan: ");
			nama_produkBeli = scan.nextLine();
			
			System.out.print("jumlah: ");
			jumlah = scan.nextInt();
			
			System.out.println(" ");
			System.out.println("Makanan yang dibeli: ");
			menu.transaksi(nama_produkBeli, jumlah);
			
			
			System.out.println("Selesaikan Pesanan?");
			konfirmasi = scan.next();
			
			if(konfirmasi.equals("yes")) {
				System.out.println("Pembayaran selesai");
				selesai = false;
			}
		}
		System.out.println(" ");
		System.out.println("STOK TERSISA");
		menu.tampilMenuProduk();
		
	}
}
