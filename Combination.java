public class Combination {
    public static int factorial (int num){
        int fac = 1;
        for (int i = num; i > 0 ; i--) {
            fac *= i;
        }
        return fac;
    }

    public int combination (int n, int r){
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
