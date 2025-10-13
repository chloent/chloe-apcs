public class NotString {

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    public static void testNotString(String str, String expected) {
        String result = notString(str);
        System.out.println("Word" + str + " Result" + result + " Expected" + expected);

        if (result.equals(expected)) {
            System.out.println("yippee");
        } else {
            System.out.println("nooo");
        }
    }

    public static void main(String[] args) {
        testNotString("candy", "not candy");
        testNotString("not good", "not good");
        testNotString("is not", "not is not");
    }
}
