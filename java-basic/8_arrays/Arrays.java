public class Arrays {

    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        int[] myNum = { 10, 20, 30, 40 };

        System.out.println("Di bawah ini adalah isi dari array cars");

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("Di bawah ini adalah index dan isi dari array cars");

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Array dengan index " + i + " berisi " + cars[i]);
        }

        System.out.println("Di bawah ini adalah isi dari array myNum");

        for (int num : myNum) {
            System.out.println(num);
        }

        System.out.println("Di bawah ini adalah index dan isi dari array myNum");

        for (int j = 0; j < myNum.length; j++) {
            System.out.println("Array dengan index " + j + " berisi " + myNum[j]);
        }

    }
}