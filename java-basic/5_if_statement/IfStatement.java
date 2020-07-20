public class IfStatement {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);

        if (x < 5) {
            System.out.println(x + " lebih besar dari 5");
        } else if ((x > 5) && (x < 10)) {
            System.out.println(x + " lebih besar dari 5 kurang dari 10");
        } else {
            System.out.println(x + " lebih kecil dari 10");
        }

    }
}