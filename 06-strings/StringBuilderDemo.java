package day2;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Welcome");

        str.append(" To Java");
        str.insert(7, "Everyone");
        System.out.println(str);
        str.reverse();
        System.out.println(str);


    }
}
