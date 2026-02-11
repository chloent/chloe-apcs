import java.util.*;

public class SumOfSquaresList {
    public static double sumOfSquaresList(ArrayList<Double> nums) {
        double total = 0;

        for (int t = 0; t < nums.size(); t++) {
            total += nums.get(t) * nums.get(t);
        }
        return total;
    }

    public static void testSumOfSquaresList(ArrayList<Double> nums, double expected) 
    {
        double result = sumOfSquaresList(nums);
        System.out.println("nums: " + nums + ", expected: " + expected);

        if (result == expected) {
            System.out.println("yayyy");
        } else {
            System.out.println("nooo");
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> values = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        testSumOfSquaresList(values, 30.0);

        ArrayList<Double> values2 = new ArrayList<Double>(Arrays.asList(1.0, 2.0));
        testSumOfSquaresList(values2, 5.0);

        ArrayList<Double> values3 = new ArrayList<Double>(Arrays.asList(2.0, 1.0, 5.0));
        testSumOfSquaresList(values3, 30.0);
    }
}
