

abstract class Produk {
    private String nama;
    private double harga;
    private int stok;

    public Produk (String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public int getStok(){
        return stok;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

public void tampilInfo(){
    System.out.println("Produk      : " + nama);
    System.out.println("Kategori    : " + kategori);
    System.out.println("Harga       : Rp" + harga);
    System.out.println("Stok        : " + stok);
    System.out.println("-------------------");
}
}