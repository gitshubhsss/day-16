public class reapeat {
    public static void main(String[] args) {
        // set the third bit

        int n = 1010101;
        int k = 3;
        int mask = (1 >> k);
        int ans = (n | mask);
        System.out.print(ans);

    }
}