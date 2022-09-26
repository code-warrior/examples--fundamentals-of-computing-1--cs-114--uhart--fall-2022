public class ASingleWhileLoop {
    public static void main(String[] args) {
        for(int i = 0, j = 20; i < 5; i++, j--.+) {
            System.out.println("The value of i is " + i);
        }

        System.out.println();

        int i = 0;

        // The while equivalent of the for loop above.
        while(i < 5) {
            System.out.println("The value of i is " + i);

            i++;
        }
    }
}
