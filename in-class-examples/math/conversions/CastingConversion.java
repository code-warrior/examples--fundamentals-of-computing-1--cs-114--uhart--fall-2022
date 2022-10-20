public class CastingConversion {
    public static void main(String[] args) {
        final int MAX = 6;

        System.out.printf("%s%n", "Generate a pseudo-random number between 1–6:");
        for(int i = 0; i < MAX; i++) {
            /*
             * 1. Generate a random double between 0.0 (inclusive)–1.0 (exclusive)
             * 2. Multiply the result by MAX (6, in this case), meaning that random
             *    numbers between 0–5 will be generated.
             * 3. Cast the result to an int, removing the floating-point value to the
             *    right of the period.
             * 4. Add 1, since random doesn’t generate 1.0 in its generation of
             *    pseudo-random numbers.
             */
            System.out.printf("%d%n", (int)(Math.random() * MAX) + 1);
        }
    }
}
