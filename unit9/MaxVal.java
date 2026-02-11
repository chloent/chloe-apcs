public class MaxValueTest {

    public static double maxValue(double[] nums) {
        double max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void testMaxValue() {
        System.out.println(maxValue(new double[]{1.0, 2.0, 3.0}) == 3.0);
        System.out.println(maxValue(new double[]{5.5, 2.2, 5.4}) == 5.5);
        System.out.println(maxValue(new double[]{-1.0, -5.0, -3.0}) == -1.0);
        System.out.println(maxValue(new double[]{7.0}) == 7.0);
    }

    public static void main(String[] args) {
        testMaxValue();
    }
}
