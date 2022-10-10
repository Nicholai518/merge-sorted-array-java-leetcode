public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // pointers
        int arrayOnePointer = m - 1;
        int arrayTwoPointer = n - 1;
        int currentIndex = m + n - 1;

        // starting from the back of the second array
        // we are going to fill in all remaining indexes
        // from the first array
        while (arrayTwoPointer >= 0) {

            // as long as we are at a valid index in first array
            // if the first array value is greater than the second array value
            // assign the first array value to the index
            if (arrayOnePointer >= 0 && nums1[arrayOnePointer] > nums2[arrayTwoPointer]) {
                nums1[currentIndex] = nums1[arrayOnePointer];

                // decrement index
                // decrement first array index
                currentIndex--;
                arrayOnePointer--;
            }

            // the second array value is greater than the first array value
            // assign the second array value to the index
            else {
                nums1[currentIndex] = nums2[arrayTwoPointer];

                // decrement index
                // decrement second array index
                currentIndex--;
                arrayTwoPointer--;
            }
        }
    }
}
