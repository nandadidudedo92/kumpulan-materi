public class ArraysSearching {

    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        int found = 0;

        for (int i = 0; i < cars.length; i++) {

            if (cars[i].equals("Ford")) {
                found = i;
            }
        }

        if (found > 0) {
            System.out.println("Ford is in index " + found);
        }

    }
}