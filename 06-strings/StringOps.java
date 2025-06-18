public class StringOps {
    public static void main(String[] args) {
        String str = " Hello Java ";
        System.out.println("Length: " + str.length());
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Substring: " + str.substring(1, 6));
        System.out.println("Replaced: " + str.replace("Java", "World"));
    }
}
