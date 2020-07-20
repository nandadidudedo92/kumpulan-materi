public class Kalkulator {

    public static void main(String[] args) {

        int angka1 = Integer.parseInt(args[0]);

        int angka2 = Integer.parseInt(args[1]);

        System.out.println(tambah(angka1, angka2));

    }

    static int tambah(int x, int y) {
        int hasil = x + y;

        return hasil;
    }

}