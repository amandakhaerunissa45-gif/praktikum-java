public class StringDeclarations {
    public static void main(String[] args) {
        String myString1 = "abc";
        String myString2 = new String("abc");
        char[] letters = {'a', 'b', 'c'};
        String myString3 = new String(letters);
        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(myString3);
    }
}