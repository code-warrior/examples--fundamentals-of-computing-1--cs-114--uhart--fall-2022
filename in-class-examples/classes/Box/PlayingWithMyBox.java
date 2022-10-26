public class PlayingWithMyBox {
    public static void main(String[] args) {
        MyBox myAwesomeBox = new MyBox();

        myAwesomeBox.setColor("green");
        myAwesomeBox.setDimensions(30, 390, 300);
        System.out.printf("%s%s%n",
            "The color of my box is now ",
            myAwesomeBox.getColor());

        System.out.println("Retrieving the dimensions of the box:");

        System.out.printf("\t%s%f%n", "The width of the box is ",
            myAwesomeBox.getWidth());
        System.out.printf("\t%s%f%n", "The height of the box is ",
            myAwesomeBox.getHeight());
        System.out.printf("\t%s%f%n", "The length of the box is ",
            myAwesomeBox.getLength());
    }
}
