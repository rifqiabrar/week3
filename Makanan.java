 class Makanan extends Produk {
    private String kedaluwarsa;
    private String kategori;

    public Makanan(String nama, double harga, int stok, String kedaluwarsa, String kategori) {
        super(nama, harga, stok);
        this.kedaluwarsa = kedaluwarsa;
        this.kategori = kategori;
    }

    public String getKedaluwarsa(){
        return kedaluwarsa;
    }

    public String getKategori(){
        return kategori;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Makanan");
        System.out.println("Kategori : " + kategori);
        System.out.println("Kedaluwarsa: " + Kedaluwarsa);
        System.out.println("--------");
    }

    // OVERLOADING hitungDiskon()
    // Versi 1 - diskon otomatis jika beli >=10
    public double hitungDiskon(int jumlahBeli) {
        if (jumlahBeli >= 10)
            return hitungTotalHarga(jumlahBeli) * 0.05;
        return 0;
    }

    public void setExpired(int expired) {
        if (expired < 0) {
            System.out.println("Masa Expired Tidak Boleh Negatif");
        } else {
            this.expired = expired;
        }
    }

    public void setExpired(int expired, String type) {
        if (type.equals("Nasi")) {
            if (expired > 4) {
                System.out.println("Masa Expired Tidak Boleh Negatif");
            } else {
                this.expired = expired;
            }
        } else {
            if (expired < 2) {
                System.out.println("Masa Expired Tidak Boleh Negatif");
            } else {
                this.expired = expired;
            }
        }
    }

}