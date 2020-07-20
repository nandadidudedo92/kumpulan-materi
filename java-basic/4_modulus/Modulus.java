public class Modulus {

    public static void main(String[] args) {

        int angka1 = Integer.parseInt(args[0]);

        int hasil = angka1 % 2;

		if(hasil == 0){
        System.out.println(hasil + " adalah angka Genap");
		} else {			
        System.out.println(hasil + " adalah angka Ganjil");
		}


    }
}