public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reverse = new StringBuffer(str).reverse().toString();

        if (str.equals(reverse))
            System.out.println("String is a Palindrome");
        else
            System.out.println("String is not a Palindrome");
    }
}
