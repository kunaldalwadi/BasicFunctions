import java.util.HashMap;

public class FibonacciRecursion {

    static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public static void main(String[] args) {

        int N = 45;

        System.out.println(fibonacci2(N));
        System.out.println(fibonacci1(N));

    }

    //Without memoization
    public static int fibonacci1(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci1(n-1) + fibonacci1(n-2);
        }
    }

    //With Memoization (saving expensive method calls to save multiple times computation time)
    private static int fibonacci2(int n) {

        if (cache.containsKey(n))
        {
            return cache.get(n);
        }

        int total;

        if (n<2)
        {
            total = n;
        }
        else
        {
            total = fibonacci2(n-1) + fibonacci2(n-2);
        }

        cache.put(n,total);

        return total;
    }


}
