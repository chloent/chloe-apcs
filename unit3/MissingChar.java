public class MissingChar {

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    public static void testMissingChar(String str, int n, String expected) {
        String result = missingChar(str, n);
        System.out.println("Word" + str + "number"+n+"result"+result);

        if (result.equals(expected)) {
            System.out.println("true");
        } else {
            System.out.println("nooo");
        }
    }

    public static void main(String[] args) {
        // unit tests
        testMissingChar("Hello", 2, "Helo");
        testMissingChar("Blue", 1, "Bue");
        testMissingChar("Curiosity", 5, "Curioity");
    }
}
