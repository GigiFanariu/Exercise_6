public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you";

        String firstChars = string1.substring(0, 2);
        String lastChars = string2.substring(string2.length() - 2);

        String charArray = firstChars + lastChars;

        System.out.println(charArray);
    }
}
