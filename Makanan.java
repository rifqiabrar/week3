 class Makanan extends Produk {
    private String kedaluwarsa;
    private String kategori;

    public Makanan(String nama, double harga, int stok, String kedaluwarsa, String kategori) {
        super(nama, harga, stok);
        this.kedaluwarsa = kedaluwarsa;
        this.kategori = kategori;
    }


    @Override
    public void tampilInfo() {
        System.out.println("Makanan");
        super.tampilInfo();
        System.out.println("Masa Expired: " + expired + " Hari");
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