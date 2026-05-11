

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

public void beli(int jumlahBeli) {
    if (jumlahBeli <= 0) {
        System.out.println("Jumlah beli harus lebih dari 0!");
        return;
    }
    if (jumlahBeli > stok) {
        System.out.println("Stok" + nama + " tidak cukup! Tersisa: " + stok);
        return;
    }
    stok -= jumlahBeli;
    System.out.println(" Beli " + nama + " x" + jumlahBeli + " = Rp" + hitungTotalHarga(jumlahBeli) + " | Sisa stok: " + stok);
    
}
}