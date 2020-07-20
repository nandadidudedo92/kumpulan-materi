public class Kalkulator {

    public static void main(String[] args) {

        String perintah = args[0];

        int parameter1 = Integer.parseInt(args[1]);

        int parameter2 = Integer.parseInt(args[2]);

        int hasil = parameter1 + parameter2;

        System.out.println(parameter1 + " di" + perintah + " " + parameter2 + " adalah " + hasil);
    }
}