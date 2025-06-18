package day2;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = new String("AbcbA");

        String rev = new StringBuilder(input).reverse().toString();

        if(input.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
