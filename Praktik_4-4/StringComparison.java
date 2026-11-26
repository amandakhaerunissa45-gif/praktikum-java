public class StringComparison {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";
        System.out.println("a. " + s1.compareTo(s2)); // -3
        System.out.println("b. " + s2.equals(s3));     // false
        System.out.println("c. " + (s3 == s1));        // true
        System.out.println("d. " + s2.compareTo(s3));  // 3
        System.out.println("e. " + s3.equals(s1));    // true
    }
}