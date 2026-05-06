 class Elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;
    
    public Elektronik(String nama, String merek, double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }

    public String getMarket() {
        return merek;
    }

    public int getGaransiTahun() {
        return garansiTahun;
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