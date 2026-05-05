public class Main {
    public static void main (String args []){
        Elektronik mesinCuci = new Elektronik("Samsung", 2000000.0, 20, "Alat Rumah", 5);

        mesinCuci.setGaransi(0);
        mesinCuci.tampilInfo();

    }
}