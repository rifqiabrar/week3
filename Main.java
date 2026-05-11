public class Main {
    public static void main (String args []){

        Elektronik laptop = new Elektronik("Laptop Asus", "Asus", 8500000, 10, 2);
        Elektronik hp = new Elektronik("HP Samsung", "Samsung", 3200000, 25, 1);
        Makanan indomie = new Makanan("Indomie Goreng", 3500, 100, "2026-12-01", "Mie Instan");
        Makanan roti = new Makanan("Roti Tawar", 8000, 50, "2026-04-30", "Roti");

        // --- Overriding - satu nama method untuk semua ------------------------
        System.out.println("====== DAFTAR PRODUK ======");
        laptop.tampilInfo(); // versi Elektronik
        hp.tampilInfo(); // versi Elektronik
        indomie.tampilInfo(); // versi Makanan
        roti.tampilInfo(); // versi Makanan

        // --- Overloading hitungPajak() ----------------------------------------
        System.out.println("====== RINCIAN PAJAK ELEKTRONIK ======");

        // Versi 1 - pajak standar
        double pajakLaptop = laptop.hitungPajak(1);
        double totalLaptop = laptop.hitugHargaSetelahPajak(1);
        System.out.println("Laptop x1 (PPN standar 11%)");
        System.out.println("  Subtotal : Rp" + laptop.hitungTotalHarga(1));
        System.out.println("  Pajak    : Rp" + pajakLaptop);
        System.out.println("  Total    : Rp" + totalLaptop);

        // Versi 2 - pajak custom 5% (misal barang impor khusus)
        double pajakHpCustom = hp.hitungPajak(2);
        System.out.println("\nHP Samsung x2 (pajak custom 5%)");
        System.out.println("  Subtotal : Rp" + hp.hitungTotalHarga(2));
        System.out.println("  Pajak    : Rp" + pajakHpCustom);
        System.out.println("  Total    : Rp" + (hp.hitungTotalHarga(2) + pajakHpCustom));

        


        
    }
}