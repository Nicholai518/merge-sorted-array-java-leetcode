import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println("Example One : " + Arrays.toString(nums1));

        int[] nums3 = new int[]{1};
        m = 1;
        int[] nums4 = new int[]{};
        n = 0;
        solution.merge(nums3, m, nums4, n);
        System.out.println("Example Two : " + Arrays.toString(nums3));
    }
}
