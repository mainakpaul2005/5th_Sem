public class TestMain {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Java";

        System.out.println("Length: " + s1.length());
        System.out.println("Concatenation: " + s1.concat(s2));
        System.out.println("Character at index 1: " + s1.charAt(1));
        System.out.println("Substring: " + s1.substring(1, 4));
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Compare: " + s1.compareTo(s2));
        System.out.println("Replace: " + s1.replace('l', 'x'));
        System.out.println("Contains: " + s1.contains("ell"));
    }
}