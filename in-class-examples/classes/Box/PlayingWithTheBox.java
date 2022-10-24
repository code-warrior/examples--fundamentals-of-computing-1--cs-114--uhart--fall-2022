public class PlayingWithTheBox {
    public static void main(String[] args) {
        MyBox myAwesomeBox = new MyBox();

        myAwesomeBox.setColor("green");
        myAwesomeBox.setDimensions(30, 390, 300);
        System.out.printf("%s%s%n",
            "The color of my box is now ",
            myAwesomeBox.getColor());=
    }
}
