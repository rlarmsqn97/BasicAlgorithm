package algorithm.no5;

public class No15596 {
    public long sum(int[] a) {
        long b = 0;
        for(int i=0; i < a.length; i++) {
            b += a[i];
        }
        return b;
    }
}
