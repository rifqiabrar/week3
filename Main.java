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
        


        
    }
}