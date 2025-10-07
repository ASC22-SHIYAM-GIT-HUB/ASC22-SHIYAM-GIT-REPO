public class StringMethodsTest {
    public static void main(String[] args) {
        String str = " Hello World ";
        String anotherStr = "hello world";

        System.out.println("charAt(1): " + str.charAt(1));
        System.out.println("contains(\"World\"): " + str.contains("World"));
        System.out.println("length(): " + str.length());
        System.out.println("indexOf(\"o\"): " + str.indexOf("o"));
        System.out.println("equals(anotherStr): " + str.equals(anotherStr));
        System.out.println("equalsIgnoreCase(anotherStr): " + str.trim().equalsIgnoreCase(anotherStr));
        System.out.println("join: " + String.join("-", "A", "B", "C"));
        System.out.println("lastIndexOf(\"o\"): " + str.lastIndexOf("o"));
        System.out.println("substring(1, 6): " + str.substring(1, 6));
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("trim(): '" + str.trim() + "'");
    }
}
