

public class Produk {
    private String nama;
    public String kategori;
    private double harga;
    private int stok;

    public Produk (String nama, double harga, int stok, String kategori){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
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

public void tampilInfo(){
    System.out.println("Produk      : " + nama);
    System.out.println("Kategori    : " + kategori);
    System.out.println("Harga       : Rp" + harga);
    System.out.println("Stok        : " + stok);
    System.out.println("-------------------");
}
}