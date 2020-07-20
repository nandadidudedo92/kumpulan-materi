public class ArraysBasic {

    public static void main(String[] args) {
        int[] numbers2;
        numbers2 = new int[] { 42, 55, 99 };

        for (int i : numbers2) {
            System.out.println(i);
        }

        System.out.println("Di bawah ini kita akan mengganti isi dari array numbers2 dengan index 2 ");

        numbers2[2] = 100;

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("Array dengan index " + i + " berisi " + numbers2[i]);
        }
    }
}