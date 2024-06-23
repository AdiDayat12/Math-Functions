public class Permutation {
    public static int factorial (int num){
        if (num <= 1){
            return 1;
        }else {
            return num * factorial(num - 1);
        }
    }
    public int permutaion (int n, int r){
        return factorial(n) / factorial(n - r);
    }
}
