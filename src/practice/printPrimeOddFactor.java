package practice;

public class printPrimeOddFactor {

    static int factor(int n ){

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i == 1) {
                    sum += i;
                }
                for (int j = 2; j <= i / 2; j++) {
                    if ((i % j) == 0 && (i % 2) != 0) {
                        sum += i;
                        System.out.println("sum" + sum);
                    }
                }
            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello "+factor(18));

    }
}
