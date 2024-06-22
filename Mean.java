import java.util.Arrays;

public class Mean {
    public static double findMean (int [] nums) {
        int mean = 0;
        for (int num : nums) {
            mean += num;
        }
        return (double) mean / nums.length;
    }
    public static double findMean (double [] nums){
        return Arrays.stream(nums).reduce(0, Double::sum) / nums.length;
    }
}
