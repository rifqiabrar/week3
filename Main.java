public class Main {
    public static void main (String args []){
        Produk p = new Produk("Baju", 100000.0, 5, "pakaian");

        System.out.println(p.getNama());
        System.out.println(p.getHarga());

        p.setHarga(20000);
        System.out.println(p.getHarga());
    }
}