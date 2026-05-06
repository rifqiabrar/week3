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
        System.out.println("Nama   : " + getNama());
        //super.tampilInfo();
        System.out.println("Merek: " + merek);
        System.out.println("Garansi : " + garansiTahun + " tahun");
        System.out.println("-----------");
    }

    //OVERLOADING hitungPajak
    //Versi 1 - pajak standar PPN 11%   
    public double hitungDiskon(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) * PPN;
    }
    //Versi 2 - pajak dengan presentase custom
    public double hitunngDiskon(int jumlahBeli, double persenPajak) {
        return hitungTotalHarga(jumlahBeli) * (persenPajak / 100); 
    }
    public double hitugHargaSetelahPajak(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) + hitungPajak(jumlahBeli);
    }

    @Override
    public double hitungPajak(double harga) {
        return harga * 0.20;
    }

}