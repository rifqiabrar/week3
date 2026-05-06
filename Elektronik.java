public class Elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;
    
    Elektronik(String nama, double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
    }

    @Override
    public void tampilInfo(){
        System.out.println("Elektronik");
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