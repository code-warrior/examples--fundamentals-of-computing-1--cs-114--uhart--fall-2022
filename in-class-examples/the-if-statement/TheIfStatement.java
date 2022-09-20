public class TheIfStatement {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        /*
         * Because x is not equal to 9, the expression on the right is never
         * evaluated, because of the short-circuited nature of the Boolean &&.
         * Consequently, the post-fix operator never increments y.
         */
        if ((x == 9) && (y++ == 20)) {
            System.out.println("\n\tx is equal to 10 and y is equal to 20");
        }

        System.out.println("\n\tThe current value of y is " + y + "\n");

        /*
         * The following Boolean && forces evaluation of the right hand
         * expression, because the left hand expression (x++ == 10) yields true.
         */
        if ((x++ == 10) && (y++ == 20)) {
            System.out.println("\tx is equal to 10 and y is equal to 20\n");
        }

        System.out.println("\tThe current value of x is " + x +
            " and the current value of y is " + y);
    }
}
