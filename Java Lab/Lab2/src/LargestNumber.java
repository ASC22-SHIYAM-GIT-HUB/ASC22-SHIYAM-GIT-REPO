public class LargestNumber {
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println("Largest is: " + largest(42, 17, 63));
    }
}
