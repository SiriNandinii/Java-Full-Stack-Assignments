package java8;

@FunctionalInterface
interface StringOperation {

    String operate(String str);
}

public class StringOperations {

    public static void main(String[] args) {

        String text = "Java Eight";

        StringOperation upper =
                str -> str.toUpperCase();

        StringOperation lower =
                str -> str.toLowerCase();

        StringOperation reverse =
                str -> new StringBuilder(str).reverse().toString();

        System.out.println("Original : " + text);

        System.out.println("Uppercase : " +
                upper.operate(text));

        System.out.println("Lowercase : " +
                lower.operate(text));

        System.out.println("Reverse : " +
                reverse.operate(text));

        System.out.println("Length : " +
                text.length());
    }
}