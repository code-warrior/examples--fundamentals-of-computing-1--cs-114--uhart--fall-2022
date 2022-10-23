public class PassByValueMethod {
    public static void swapByValue(int x, int y) {
        System.out.printf("The value of x within method `swapByValue` " +
            "before carrying out the swap routine is %d%n",
            x);
        System.out.printf("The value of y within method `swapByValue` " +
            "before carrying out the swap routine is %d%n%n",
            y);

        int temp = x;
        x = y;
        y = temp;

        System.out.printf("The value of x within method `swapByValue` " +
            "after carrying out the swap routine is %d%n",
            x);
        System.out.printf("The value of y within method `swapByValue` " +
            "after carrying out the swap routine is %d%n%n",
            y);

    }

    public static void main(String[] args) {
        int x = 20;
        int y = 30;

        System.out.printf("The value of x within method `main` " +
            "before invoking the `swapByValue` method is %d%n",
            x);
        System.out.printf("The value of y within method `main` " +
            "before invoking the `swapByValue` method is %d%n%n",
            y);

        swapByValue(x, y);


        System.out.printf("The value of x within method `main` " +
            "after invoking the `swapByValue` method is %d%n",
            x);
        System.out.printf("The value of y within method `main` " +
            "after invoking the `swapByValue` method is %d%n%n",
            y);
    }
}
