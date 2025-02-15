public class ReverseStringUsingBuilder {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = reverseString(input);
        System.out.println("Reversed String: " + output);
    }
}

