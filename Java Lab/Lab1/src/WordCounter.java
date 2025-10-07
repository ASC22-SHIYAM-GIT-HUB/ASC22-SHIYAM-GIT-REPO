public class WordCounter {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Sum of 12 and 20 is 32";
        int count = countWords(input);
        System.out.println("Word Count: " + count);
    }
}

