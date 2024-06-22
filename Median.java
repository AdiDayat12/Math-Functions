

import java.util.Arrays;

public class Median {
    public static <T extends Number & Comparable<T>> double findMedian ( T[] nums){
        Arrays.sort(nums);
        int len = nums.length;
        if (len % 2 == 0){
            T mid = nums[len / 2];
            T mid2 = nums[(len / 2) - 1];
            return (mid2.doubleValue() + mid.doubleValue()) / 2;
        }else {
            return nums[len / 2].doubleValue();
        }
    }

}
