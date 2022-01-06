public class Tugas1 {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch(ArithmeticException e) {
            System.out.println("Tidak bisa dibagi dengan 0");
        }
    }
}
