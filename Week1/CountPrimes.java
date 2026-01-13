package Week1;

import java.util.Arrays;

public class CountPrimes {
    public static int countPrimes(int n) {
        if (n == 0 || n == 1)
            return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i] == false)
                continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        // System.out.println(Arrays.toString(isPrime));

        int c = 0;
        for (boolean el : isPrime) {
            if (el)
                c++;
        }
        return c;

    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println(countPrimes(n));

    }
}
