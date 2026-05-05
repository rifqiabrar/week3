public class Elektronik extends Produk {
    private int garansi;
    public Elektronik(String nama, double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
    }

    public void tampilkanData(){
        super.tampilInfo();
        System.out.println("Masa Expired: " + garansi + " Hari");
    }

    public void setGaransi(int garansi){
        if(garansi < 1){
            System.out.println("Masa Expired Tidak Boleh Negatif");
        }else{
            this.garansi = garansi;
        }
    }
}