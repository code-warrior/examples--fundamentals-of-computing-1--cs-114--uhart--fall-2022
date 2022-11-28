public class TernaryOperatorExample {
    public static void main(String[] args) {
        int x = 1;
        Boolean isXOne;

        // if(x == 1) {
        //  isXOne = true;
        // } else {
        //  isXOne = false;
        // }

        // Equivalent to lines 6–10
        isXOne = (x == 1? true: false);

        System.out.println("The boolean isXOne is " + isXOne);
    }
}
