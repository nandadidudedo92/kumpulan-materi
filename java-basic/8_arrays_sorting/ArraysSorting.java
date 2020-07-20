public class ArraysSorting {

    public static void main(String[] args) {

        int[] numbers = { 19, 30, 29, 51, 42, 732, 7, 2, 6, 52, 34 };
        int temp;

        System.out.println("Di bawah ini adalah numbers sebelum di sorting");

        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Di bawah ini adalah numbers setelah di sorting Ascending");

        for (int i = 1; i < numbers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }

        for (int num : numbers) {
            System.out.println(num);
        }

    }
}