public class StringPerformanceComparison {
    public static void main(String[] args) {
        int N = 1_000_000;
        long start, time;

        start = System.nanoTime();
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "a";
        }
        time = System.nanoTime() - start;
        System.out.println("String Concatenation Time: " + time / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        time = System.nanoTime() - start;
        System.out.println("StringBuilder Concatenation Time: " + time / 1e6 + " ms");

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbf.append("a");
        }
        time = System.nanoTime() - start;
        System.out.println("StringBuffer Concatenation Time: " + time / 1e6 + " ms");
    }
}
