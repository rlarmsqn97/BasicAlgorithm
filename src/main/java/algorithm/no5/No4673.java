package algorithm.no5;

public class No4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        for(int i=1; i < 10001; i++) {
            if(d(i) < 10001) {
                arr[d(i)] = true;
            }
        }
        for(int i=1; i < arr.length; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }
    }
    public static int d(int n) {
        int sum=n; // n = 1234
        while(n != 0) {
            sum = sum + (n % 10);
            n = n/10;
        }
        return sum;
    }
}
