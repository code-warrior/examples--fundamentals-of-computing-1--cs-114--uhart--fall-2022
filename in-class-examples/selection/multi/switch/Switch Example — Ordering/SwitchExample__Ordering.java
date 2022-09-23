/*
 * Java is indifferent to the ordering of your cases. Thus, you can create a
 * switching system that is unordered. This, however, isn’t good style; avoid
 * it. Order your cases in a logical stack.
 */
public class SwitchExample__Ordering {
    public static void main(String[] args) {
        byte myByte = 30;

        switch(myByte) {
            default:
                System.out.println("You entered neither 0 nor 2.");

                break;

            case 2:
                System.out.println("You entered the number 2.");

                break;

            case 0:
                System.out.println("You entered the number 0.");

                break;
        }
    }
}
