public class StringConcatenationUsingBuffer {
    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();

        for (String str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] input = {"Hello", " ", "World", "!", " Have", " a", " great", " day!"};
        String result = concatenateStrings(input);
        System.out.println("Concatenated String: " + result);
    }
}

