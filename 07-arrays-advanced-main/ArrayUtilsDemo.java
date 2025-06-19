import org.apache.commons.lang3.ArrayUtils;

public class ArrayUtilsDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nums = ArrayUtils.add(nums, 4);
        System.out.println(ArrayUtils.toString(nums));
    }
}
