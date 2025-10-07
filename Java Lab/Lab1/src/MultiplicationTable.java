public class MultiplicationTable {

    public static void printTableFor(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void printTableWhile(int number) {
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }

    public static void printTableDoWhile(int number) {
        int i = 1;
        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        int input = 2;

        System.out.println("Using for loop:");
        printTableFor(input);

        System.out.println("\nUsing while loop:");
        printTableWhile(input);

        System.out.println("\nUsing do-while loop:");
        printTableDoWhile(input);
    }
}
