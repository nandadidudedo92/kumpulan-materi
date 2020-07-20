public class CaseStatement {

    public static void main(String[] args) {
        String operator = args[0];

        switch (operator) {
            case "tambah":
                System.out.println("anda memilih operasi penjumlahan");
                break;
            case "kurang":
                System.out.println("anda memilih operasi pengurangan");
                break;
            default:
                System.out.println("gunakan parameter tambah atau kurang");
        }

    }
}