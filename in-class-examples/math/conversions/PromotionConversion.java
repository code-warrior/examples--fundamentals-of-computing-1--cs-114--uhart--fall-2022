/*
 * Conversion via promotion occurs automatically when certain operators need to
 * modify their operands in order to perform the operation.
 */
public class PromotionConversion {
    public static void main(String[] args) {
        float sum = 7; // or 7.f or 7.0f
        int count = 3;

        /*
         * 1. The value to variable sum is really 7.0, not just 7, per the assignment
         *    on line X, because it’s a float.
         * 2. If the division had truly been 7/3, then integer division would
         *    truncate the result, yielding a value of 2.
         * 3. Thus, variable count is promoted to 3.0, so the final division is
         *    7.0/3.0.
         */
        System.out.println(sum / count);
    }
}
