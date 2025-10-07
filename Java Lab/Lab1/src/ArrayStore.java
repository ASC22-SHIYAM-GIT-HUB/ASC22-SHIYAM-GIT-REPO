import java.util.*;

public class ArrayStore {
    private int[] arr = new int[10];

    public void acceptInput(Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void displayWithWhile() {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public void displayWithFor() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sortArray() {
        Arrays.sort(arr);
    }

    public int countOccurrences(int num) {
        int count = 0;
        for (int value : arr) {
            if (value == num) count++;
        }
        return count;
    }

    public void insertAt(int value, int position) {
        if (position < 0 || position >= arr.length) return;
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = value;
    }

    public int[] removeDuplicates() {
        Set<Integer> set = new LinkedHashSet<>();
        for (int value : arr) {
            set.add(value);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int val : set) {
            result[i++] = val;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStore store = new ArrayStore();

        store.acceptInput(sc);
        System.out.println("Display using while loop:");
        store.displayWithWhile();

        System.out.println("Display using for loop:");
        store.displayWithFor();

        store.sortArray();
        System.out.println("Sorted array:");
        store.displayWithFor();

        System.out.print("Enter number to count: ");
        int num = sc.nextInt();
        System.out.println("Occurrences: " + store.countOccurrences(num));

        System.out.print("Enter value and position to insert: ");
        int val = sc.nextInt();
        int pos = sc.nextInt();
        store.insertAt(val, pos);
        System.out.println("After insertion:");
        store.displayWithFor();

        int[] noDuplicates = store.removeDuplicates();
        System.out.println("Without duplicates:");
        for (int n : noDuplicates) {
            System.out.print(n + " ");
        }
    }
}
