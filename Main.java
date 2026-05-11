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

          // --- Overloading hitungDiskon() ---------------------------------------
        System.out.println("\n====== RINCIAN DISKON MAKANAN ======");

        // Versi 1 - diskon otomatis beli >= 10
        System.out.println("Indomie x10 (diskon otomatis)");
        System.out.println("  Subtotal : Rp" + indomie.hitungTotalHarga(10));
        System.out.println("  Diskon   : Rp" + indomie.hitungDiskon(10));
        System.out.println("  Total    : Rp" + indomie.hitungHargaSetelahDiskon(10));

        // Versi 2 - diskon custom 15% (misal promo spesial)
        System.out.println("\nRoti x5 (diskon custom 15%)");
        System.out.println("  Subtotal : Rp" + roti.hitungTotalHarga(5));
        System.out.println("  Diskon   : Rp" + roti.hitungDiskon(5, 15));
        System.out.println("  Total    : Rp" + (roti.hitungTotalHarga(5) - roti.hitungDiskon(5, 15)));

        // --- Transaksi --------------------------------------------------------
        System.out.println("\n====== TRANSAKSI ======");
        laptop.beli(1);
        hp.beli(2);
        indomie.beli(10);
        roti.beli(5);    
    }
}