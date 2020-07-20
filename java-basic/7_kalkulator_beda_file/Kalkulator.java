public class Kalkulator {

    public static void main(String[] args) {

        int angka1 = Integer.parseInt(args[0]);

        int angka2 = Integer.parseInt(args[1]);

        Penjumlahan jml = new Penjumlahan();

        System.out.println(jml.tambah(angka1, angka2));

    }

}