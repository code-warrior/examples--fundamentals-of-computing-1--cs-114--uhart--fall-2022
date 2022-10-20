public class AssignmentConversion {
    public static void main(String[] args) {
        /*
         * Only widening conversions can be accomplished through assignment, thus,
         * the title: assignment conversion.
         */
        float money;
        int dollars = 20;

        System.out.println("Variable `dollars` is " + dollars);
        money = dollars;

        System.out.println("Variable `dollars` is still " + dollars);
        System.out.println("The assignment `money = dollars` makes a " +
            "floating-point version of the variable `money`: " + money);
    }
}
